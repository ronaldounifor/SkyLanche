package model;
public class Comida extends Item {
    private int peso;

    public Comida(int id, double preco, String descricao, int peso) {
        this.setId(id);
        this.setPreco(preco);
        this.setDescricao(descricao);
        this.peso = peso;
    }

    @Override
    public void despensar() {
        System.out.println("Tenha cuidado");
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
