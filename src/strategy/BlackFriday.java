package strategy;

public class BlackFriday extends Estrategia {

    @Override
    public void aplicarDesconto() {
        venda.setValorFinal(venda.getValorFinal()*0.8);
    }

}