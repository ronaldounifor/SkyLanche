package composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends Arquivo {
    private List<Arquivo> arquivos;

    public Pasta() {
        arquivos = new ArrayList<>();
    }

    public void adicionarArquivo(Arquivo arquivo) {
        arquivos.add(arquivo);
    }
}
