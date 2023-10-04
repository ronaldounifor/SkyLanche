package adapter.peinte;

public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área do círculo: " +  Math.PI * Math.pow(raio, 2));
    }
    
}
