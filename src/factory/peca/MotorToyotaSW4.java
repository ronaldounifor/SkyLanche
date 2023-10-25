package factory.peca;

public class MotorToyotaSW4 extends Motor {
    private String origem;
    private int numeroRegistro;

    public MotorToyotaSW4(String marca, String modelo, int tipoCombustivel, int potencia, double capacidade,
            int quantidadeCilindros, int quantidadeValvulas, int numeroPeca, int anoFabricacao, String origem,
            int numeroRegistro) {
        super(marca, modelo, tipoCombustivel, potencia, capacidade, quantidadeCilindros, quantidadeValvulas, numeroPeca,
                anoFabricacao);
        this.origem = origem;
        this.numeroRegistro = numeroRegistro;
    }
    
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public int getNumeroRegistro() {
        return numeroRegistro;
    }
    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
}
