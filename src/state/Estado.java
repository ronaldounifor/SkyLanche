package state;

import model.Usuario;

public abstract class Estado {
    protected Usuario usuario;

    public abstract void tratar();
    public abstract double getDesconto();
    public abstract int getPontos();
}
