package strategy;

public class PrimeiraCompra extends Estrategia {

    @Override
    public void aplicarDesconto() {
        if(venda.getValorFinal() > 15)
            venda.setValorFinal(venda.getValorFinal() - 15);
        else
            venda.setValorFinal(0);
    }
}
