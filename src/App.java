import composite.Imagem;
import composite.PDF;
import composite.Pasta;

public class App {
    public static void main(String[] args) throws Exception {
        // Uso do composite
        PDF provaPAS = new PDF();
        Imagem fotoAula = new Imagem();
        Pasta estudosPAS = new Pasta();

        estudosPAS.adicionarArquivo(provaPAS);
        estudosPAS.adicionarArquivo(fotoAula);

        Pasta estudosUnifor = new Pasta();
        estudosUnifor.adicionarArquivo(estudosPAS);
        estudosUnifor.adicionarArquivo(new PDF());
    }

}
