package strategy;

import model.Venda;

public abstract class Estrategia {
    protected Venda venda;

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public abstract void aplicarDesconto();
}
