package factory;

import factory.carro.Carro;
import factory.carro.ToyotaSW4;

public class FabricaToyotaSW4 extends FabricaCarro {

    @Override
    public Carro criarCarro() {
        return new ToyotaSW4();
    }
    
}
