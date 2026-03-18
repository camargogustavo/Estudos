package Castings.test;

import Castings.domain.Funcionario;
import Castings.domain.Gerente;

public class TestUpCasting {
    public static void main(String[] args) {
        Funcionario func = new Gerente();
        func.trabalhar();
        //func.gerenciar ERRO variavel do tipo funcionario
    }
}
