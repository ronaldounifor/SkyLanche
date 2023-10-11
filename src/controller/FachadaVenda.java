package controller;

import java.util.List;

import data.ConectorBD;
import model.Venda;
import model.VendaAluno;
import observer.Funcionario;
import observer.ItemEstoque;

public class FachadaVenda {
    private ConectorBD conector;
    private ItemEstoque itemAtual;
    private Venda vendaAtual;
    private Funcionario reposicao;

    public FachadaVenda() {
        conector = ConectorBD.getInstancia();
        reposicao = new Funcionario(1, "Heitor");
    }

    public void imprimirItens() {
        List<ItemEstoque> itens = conector.pegarTodosItens();

        for (ItemEstoque item : itens)
            System.out.println(item.getItem() + ": " + item.getQuantidade());
    }

    public void selecionarItem(int escolha) {
        itemAtual = conector.pegarPorID(escolha);
        itemAtual.adicionarFuncionario(reposicao);
    }
    
    public void pagar() {
        vendaAtual = new VendaAluno();
        vendaAtual.setTotal(itemAtual.getItem().getPreco());
        // vendaAtual.efetuar(); FIXME removendo prints do Fachada
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

    public Venda getVendaAtual() {
        return vendaAtual;
    }

    public void setVendaAtual(Venda vendaAtual) {
        this.vendaAtual = vendaAtual;
    }

    public Funcionario getReposicao() {
        return reposicao;
    }

    public void setReposicao(Funcionario reposicao) {
        this.reposicao = reposicao;
    }
}
