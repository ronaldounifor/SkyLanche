package observer;

import model.Item;

public class Funcionario {
    private int matricula;
    private String nome;

    public Funcionario() {
    }

    public Funcionario(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public void atualizar (ItemEstoque ItemEstoque) {
        Item itemAtual = ItemEstoque.getItem();
        System.out.println("REPOR!!!!");
        System.out.println("Quantidade atual para o item "+itemAtual.getDescricao()+" ("+itemAtual.getId()+"):"+ItemEstoque.getQuantidade());
    }
    
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}