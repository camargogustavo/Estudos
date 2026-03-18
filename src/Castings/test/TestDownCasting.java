package Castings.test;

import Castings.domain.Funcionario;
import Castings.domain.Gerente;

public class TestDownCasting {
    public static void main(String[] args) {
        Funcionario func = new Gerente();
        func.trabalhar();

        Gerente g = (Gerente) func;
        g.gerenciar();

        Funcionario comum = new Funcionario();

    }
}
