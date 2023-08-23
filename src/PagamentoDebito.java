public class PagamentoDebito implements Pagamento {

    @Override
    public void processar() {
        System.out.println("Pedir aproximacao");
    }
    
}
