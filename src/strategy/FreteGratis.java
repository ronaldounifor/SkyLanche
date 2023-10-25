package strategy;

public class FreteGratis extends Estrategia {
    private static final int FRETE = 5;

    @Override
    public void aplicarDesconto() {
        if(venda.getValorFinal() > 100)
            venda.setValorFinal(venda.getValorFinal() - FRETE);
    }
}
