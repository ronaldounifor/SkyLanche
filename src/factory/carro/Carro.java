package factory.carro;

import factory.peca.Chassi;
import factory.peca.Motor;

public class Carro {
    private Chassi chassi;
    private Motor motor;
    public Chassi getChassi() {
        return chassi;
    }
    public void setChassi(Chassi chassi) {
        this.chassi = chassi;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
