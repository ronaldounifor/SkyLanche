package state;

import model.Usuario;

public class Premium extends Estado {
    private static final int PONTOS = 2;

    public Premium(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public double getDesconto() {
        return 0.95;
    }

    @Override
    public int getPontos() {
        return PONTOS;
    }

    @Override
    public void tratar() {
        if(usuario.getPontos() < 20)
            usuario.setEstado(new Regular(usuario));

        if(usuario.getPontos() >= 100)
            usuario.setEstado(new SuperPremium(usuario));
    }
    
}
