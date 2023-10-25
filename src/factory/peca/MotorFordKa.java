package factory.peca;

public class MotorFordKa extends Motor {
    private String OEM;

    public MotorFordKa(String marca, String modelo, int tipoCombustivel, int potencia, double capacidade,
            int quantidadeCilindros, int quantidadeValvulas, int numeroPeca, int anoFabricacao, String oEM) {
        super(marca, modelo, tipoCombustivel, potencia, capacidade, quantidadeCilindros, quantidadeValvulas, numeroPeca,
                anoFabricacao);
        OEM = oEM;
    }

    public String getOEM() {
        return OEM;
    }

    public void setOEM(String oEM) {
        OEM = oEM;
    }

}
