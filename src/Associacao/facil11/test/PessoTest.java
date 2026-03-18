package Associacao.facil11.test;

import Associacao.facil11.domain.Pessoa;
import Associacao.facil11.domain.RG;

public class PessoTest {
    public static void main(String[] args) {
        RG rg = new RG();

        Pessoa pessoa = new Pessoa();

        rg.setNumero(123123123);

        pessoa.setNome("Gustavo");

        pessoa.setRg(rg);

        pessoa.imprime();

    }
}
