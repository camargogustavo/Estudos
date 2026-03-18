package Associacao.facil11.domain;

public class Carro {
    private Motor motor;

    public void imprime(){
        System.out.println(this.motor.getNome());
        System.out.println(this.motor.getCavalos());
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
