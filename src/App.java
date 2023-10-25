import java.util.Scanner;

import controller.FachadaVenda;
import model.Usuario;
import strategy.BlackFriday;
import strategy.FreteGratis;
import strategy.PrimeiraCompra;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario(93, "Maitê");

        FachadaVenda fachada = new FachadaVenda(usuario);
        fachada.adicionarEstrategia(new FreteGratis());
        fachada.adicionarEstrategia(new PrimeiraCompra());
        fachada.adicionarEstrategia(new BlackFriday());

        Scanner scanner = new Scanner(System.in);

        int escolha = -1;

        fachada.imprimirItens();

        System.out.println("Aguardando seleção");
        escolha = scanner.nextInt();

        while(escolha != 0) {
            fachada.selecionarItem(escolha);
            fachada.pagar();
            fachada.dispensar();
            System.out.println("Total: " + fachada.getTotal());

            System.out.println();
            fachada.imprimirItens();
            System.out.println("Aguardando seleção");
            escolha = scanner.nextInt();
        }

        fachada.aplicarDesconto();
        System.out.println("Valor final: " + fachada.getVendaAtual().getValorFinal());

        scanner.close();
    }

}
