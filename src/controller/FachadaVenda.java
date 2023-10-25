package controller;

import java.util.List;

import data.ConectorBD;
import model.Usuario;
import model.Venda;
import observer.Funcionario;
import observer.ItemEstoque;
import strategy.Estrategia;

public class FachadaVenda {
    private ConectorBD conector;
    private ItemEstoque itemAtual;
    private Venda vendaAtual;
    private Funcionario reposicao;

    public FachadaVenda(Usuario usuario) {
        conector = ConectorBD.getInstancia();
        reposicao = new Funcionario(1, "Heitor");

        vendaAtual = new Venda(usuario);
    }

    public void imprimirItens() {
        List<ItemEstoque> itens = conector.pegarTodosItens();

        for (ItemEstoque item : itens)
            System.out.println(item.getItem() + ": " + item.getQuantidade());
    }

    public void selecionarItem(int escolha) {
        itemAtual = conector.pegarPorID(escolha);
        itemAtual.adicionarFuncionario(reposicao);

        vendaAtual.adicionarItem(itemAtual.getItem());
    }
    
    public void pagar() {
    //     vendaAtual.setTotal(itemAtual.getItem().getPreco());
        // vendaAtual.efetuar(); FIXME removendo prints do Fachada
        vendaAtual.getUsuarioAtual().pontuar();
    }
    
    public void dispensar() {
        itemAtual.removerItem();
    }

    public ConectorBD getConector() {
        return conector;
    }

    public void setConector(ConectorBD conector) {
        this.conector = conector;
    }

    public ItemEstoque getItemAtual() {
        return itemAtual;
    }

    public void setItemAtual(ItemEstoque itemAtual) {
        this.itemAtual = itemAtual;
    }

    public Funcionario getReposicao() {
        return reposicao;
    }

    public void setReposicao(Funcionario reposicao) {
        this.reposicao = reposicao;
    }

    public double getTotal() {
        return vendaAtual.getTotal();
    }

    public double getTotalComDesconto() {
        return vendaAtual.getTotalComDesconto();
    }

    public Venda getVendaAtual() {
        return vendaAtual;
    }

    public void adicionarEstrategia(Estrategia estrategia) {
        estrategia.setVenda(vendaAtual);
        vendaAtual.adicionarEstrategia(estrategia);
    }

    public void aplicarDesconto() {
        vendaAtual.aplicarDesconto();
    }
}
