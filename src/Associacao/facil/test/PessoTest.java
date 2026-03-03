package Associacao.facil.test;

import Associacao.facil.domain.Pessoa;
import Associacao.facil.domain.RG;

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
