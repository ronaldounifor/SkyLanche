package adapter;

import adapter.fotoshope.Figura;
import adapter.peinte.FormaGeometrica;

public class AdaptadorGeometrico extends FormaGeometrica {
    private Figura figura;

    public AdaptadorGeometrico(Figura figura) {
        this.figura = figura;
    }

    @Override
    public void calcularArea() {
        figura.calcularEspaco();
    }
}
