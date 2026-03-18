package Castings.test;

import Castings.domain.Funcionario;
import Castings.domain.Gerente;

public class TesteInstanceOf {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();

        if (f instanceof Gerente ) {
            Gerente g = (Gerente) f;
            g.gerenciar();
        } else {
            System.out.println("Esse funcionário não é um Gerente, casting cancelado!");
        }
    }
}
