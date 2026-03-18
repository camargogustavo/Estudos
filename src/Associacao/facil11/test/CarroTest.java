package Associacao.facil11.test;


import Associacao.facil11.domain.Carro;
import Associacao.facil11.domain.Motor;

public class CarroTest {
    public static void main(String[] args) {
        Motor motor = new Motor();//crie a instancia de motor{Nome e Cavalos}
        Carro carro = new Carro();//crie a instancia de carro{Motor}
        motor.setNome("Mustantg");//Diz que nome recebe Mustang
        motor.setCavalos(800);//Diz que cavalos recebe 800

        carro.setMotor(motor);//dentro do carro não recebe apenas os atributos, ela recebe a referência do objeto inteiro.
        carro.imprime();
    }
}
