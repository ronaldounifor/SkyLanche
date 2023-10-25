package state;

import model.Usuario;

public class SuperPremium extends Estado {
    private static final int PONTOS = 3;

    public SuperPremium(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public double getDesconto() {
        return 0.70;
    }

    @Override
    public int getPontos() {
        return PONTOS;
    }

    @Override
    public void tratar() {
        if(usuario.getPontos() < 100)
            usuario.setEstado(new Premium(usuario));
    }
    
}
