import data.ConectorBD;
import model.Venda;
import model.VendaAluno;
import model.VendaProfessor;

public class App {
    public static void main(String[] args) throws Exception {
        // Venda venda = new VendaAluno();
        Venda venda = new VendaProfessor();

        venda.efetuar();
    }

}
