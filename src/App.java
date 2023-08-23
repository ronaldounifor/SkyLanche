public class App {
    public static void main(String[] args) throws Exception {
        // Item twix = new Comida(0, 1, "Choc", 40);

        Pagamento pagamento2 = new PagamentoPix();
        PagamentoPix pagamento3 = new PagamentoPix();

        imprimirPagamentoPix(pagamento2);
        imprimirPagamentoPix(pagamento3);
    }

    public static void imprimirPagamentoPix(PagamentoPix pagamento) {

    }
}
