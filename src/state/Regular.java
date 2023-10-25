package state;

import model.Usuario;

public class Regular extends Estado {
    private static final int PONTOS = 1;

    public Regular(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public double getDesconto() {
        return 1;
    }

    @Override
    public int getPontos() {
        return PONTOS;
    }

    @Override
    public void tratar() {
        if(usuario.getPontos() >= 20)
            usuario.setEstado(new Premium(usuario));
    }
}
