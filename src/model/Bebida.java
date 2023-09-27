package model;
public class Bebida extends Item {
    private int volume;

    public Bebida(int id, double preco, String descricao, int volume) {
        this.setId(id);
        this.setPreco(preco);
        this.setDescricao(descricao);
        this.volume = volume;
    }

    @Override
    public void despensar() {
        System.out.println("Tenha cuidado");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
}
