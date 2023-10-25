package model;
import java.util.ArrayList;
import java.util.List;

import data.ConectorBD;
import strategy.Estrategia;

public class Venda {
    private List<Item> itens;
    private Usuario usuarioAtual;
    private List<Estrategia> estrategias;
    private double valorFinal;

    public Venda() {
        valorFinal = 0;
    }

    public Venda(Usuario usuario) {
        valorFinal = 0;
        usuarioAtual = usuario;
        this.itens = new ArrayList<>();
        this.estrategias = new ArrayList<>();
    }

    public void efetuar() {
        escolherProduto();
        escolherFormaPagamento();
        processarPagamento();
        dispensarProduto();
    }

    private void escolherProduto() {
        System.out.println("Venda - Produto escolhido no valor: "+ getTotal());
    }

    private void escolherFormaPagamento() {
        System.out.println("Venda - pagamento escolhido");
    }

    private void processarPagamento() {
        System.out.println("Venda - pagamento no valor: " + getTotal());
    }

    private void dispensarProduto() {
        System.out.println("Venda - produto dispensado");
    }

    public void iniciar() {}

    public void cancelar() {}

    public void finalizar() {
        ConectorBD conectorBD = ConectorBD.getInstancia();

        conectorBD.registrarVenda();
    }

    public double getTotal() {
        double total = 0;

        for (Item item : itens) 
            total += item.getPreco();

        return total;
    }

    public double getTotalComDesconto() {
        return getTotal() * usuarioAtual.getEstado().getDesconto();
    }

    public void aplicarDesconto() {
        valorFinal = getTotal();
        for (Estrategia estrategia : estrategias)
            estrategia.aplicarDesconto();
    }

    public void adicionarEstrategia(Estrategia estrategia) {
        estrategias.add(estrategia);
    }

    public Usuario getUsuarioAtual() {
        return usuarioAtual;
    }

    public void setUsuarioAtual(Usuario usuarioAtual) {
        this.usuarioAtual = usuarioAtual;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
}
