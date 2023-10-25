package factory.peca;

public class Motor {
    private String marca;
    private String modelo;
    private int tipoCombustivel;
    private int potencia;
    private double capacidade;
    private int quantidadeCilindros;
    private int quantidadeValvulas;
    private int numeroPeca;
    private int anoFabricacao;

    public Motor(String marca, String modelo, int tipoCombustivel, int potencia, double capacidade,
            int quantidadeCilindros, int quantidadeValvulas, int numeroPeca, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.potencia = potencia;
        this.capacidade = capacidade;
        this.quantidadeCilindros = quantidadeCilindros;
        this.quantidadeValvulas = quantidadeValvulas;
        this.numeroPeca = numeroPeca;
        this.anoFabricacao = anoFabricacao;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(int tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public double getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
    public int getQuantidadeCilindros() {
        return quantidadeCilindros;
    }
    public void setQuantidadeCilindros(int quantidadeCilindros) {
        this.quantidadeCilindros = quantidadeCilindros;
    }
    public int getQuantidadeValvulas() {
        return quantidadeValvulas;
    }
    public void setQuantidadeValvulas(int quantidadeValvulas) {
        this.quantidadeValvulas = quantidadeValvulas;
    }
    public int getNumeroPeca() {
        return numeroPeca;
    }
    public void setNumeroPeca(int numeroPeca) {
        this.numeroPeca = numeroPeca;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    
}
