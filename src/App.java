import controller.FachadaVenda;

public class App {
    public static void main(String[] args) throws Exception {
        FachadaVenda fachada = new FachadaVenda();

        fachada.imprimirItens();
        fachada.selecionarItem();
        fachada.pagar();
        fachada.dispensar();
    }

}
