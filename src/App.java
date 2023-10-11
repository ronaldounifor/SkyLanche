import java.util.Scanner;

import controller.FachadaVenda;

public class App {
    public static void main(String[] args) throws Exception {
        FachadaVenda fachada = new FachadaVenda();

        Scanner scanner = new Scanner(System.in);

        int i = 10;

        while(i > 0) {
            fachada.imprimirItens();

            System.out.println("Aguardando seleção");
            fachada.selecionarItem(scanner.nextInt());
            fachada.pagar();
            fachada.dispensar();
        }

        scanner.close();
    }

}
