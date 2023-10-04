package adapter.fotoshope;

public class FiguraCamadaUnica extends Figura {

    public FiguraCamadaUnica(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void calcularEspaco() {
        System.out.println("Espaço da figura de camada única: " + tamanho);
    }


    
}
