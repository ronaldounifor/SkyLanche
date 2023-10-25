package factory;

import factory.carro.Carro;
import factory.carro.FordKa;
import factory.peca.MotorFordKa;

public class FabricaFordKa extends FabricaCarro {

    @Override
    public Carro criarCarro() {
        FordKa novoCarro = new FordKa();

        novoCarro.setMotor(new MotorFordKa(null, null, 0, 0, 0, 0, 0, 0, 0, null));
        return novoCarro;
    }
    
}
