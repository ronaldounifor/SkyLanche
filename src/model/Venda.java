package model;

import java.util.Random;

import data.ConectorBD;

public abstract class Venda {

    protected double total;

    public Venda() {
        total = 0;
    }

    public void efetuar() {
        escolherProduto();
        escolherToppings();
        escolherFormaPagamento();
        aplicarDesconto();
        processarPagamento();
        dispensarProduto();
    }

    protected abstract void aplicarDesconto();

    protected abstract void escolherToppings();

    private void escolherProduto() {
        total = new Random().nextDouble()*10;
        System.out.println("Venda - Produto escolhido no valor: "+ total);
    }

    private void escolherFormaPagamento() {
        System.out.println("Venda - pagamento escolhido");
    }

    private void processarPagamento() {
        System.out.println("Venda - pagamento no valor: " + total);
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
}
