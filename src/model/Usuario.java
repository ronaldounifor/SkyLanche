package model;

import state.Estado;
import state.Premium;
import state.Regular;
import state.SuperPremium;

public class Usuario {
    private int pontos;
    private String nome;
    private Estado estado;
    
    public Usuario(int pontos, String nome) {
        this.pontos = pontos;
        this.nome = nome;

        if(pontos < 20)
            this.estado = new Regular(this);
        else if(pontos < 100)
            this.estado = new Premium(this);
        else
            this.estado = new SuperPremium(this);
    }

    public int getPontos() {
        return pontos;
    }

    public void pontuar() {
        this.pontos += estado.getPontos();
        estado.tratar();
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
        estado.tratar();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    
}
