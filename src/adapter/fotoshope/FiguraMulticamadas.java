package adapter.fotoshope;

import java.util.ArrayList;
import java.util.List;

public class FiguraMulticamadas extends Figura {
    private List<FiguraCamadaUnica> figuras;

    public FiguraMulticamadas() {
        figuras = new ArrayList<>();
    }

    public void adicionarCamada(FiguraCamadaUnica figura) {
        figuras.add(figura);
    }

    @Override
    public void calcularEspaco() {
        int total = 0;
        for (FiguraCamadaUnica figuraCamadaUnica : figuras)
            total += figuraCamadaUnica.tamanho;
        
        System.out.println("Espaço da figura de multicamada: " + total);
    }
}
