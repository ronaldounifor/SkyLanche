import java.util.ArrayList;
import java.util.List;

import adapter.AdaptadorGeometrico;
import adapter.fotoshope.FiguraCamadaUnica;
import adapter.fotoshope.FiguraMulticamadas;
import adapter.peinte.Circulo;
import adapter.peinte.FormaGeometrica;
import adapter.peinte.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        List<FormaGeometrica> formas = new ArrayList<>();
        formas.add(new Circulo(10));
        formas.add(new Triangulo(10, 15));

        FiguraCamadaUnica mickey = new FiguraCamadaUnica(125);
        FiguraCamadaUnica pateta = new FiguraCamadaUnica(225);
        FiguraCamadaUnica minie = new FiguraCamadaUnica(125);
        FiguraCamadaUnica pluto = new FiguraCamadaUnica(110);

        formas.add(new AdaptadorGeometrico(mickey));

        FiguraMulticamadas disney = new FiguraMulticamadas();
        disney.adicionarCamada(mickey);
        disney.adicionarCamada(pateta);
        disney.adicionarCamada(minie);
        disney.adicionarCamada(pluto);

        formas.add(new AdaptadorGeometrico(disney));

        for (FormaGeometrica formaGeometrica : formas)
            formaGeometrica.calcularArea();
    }

}
