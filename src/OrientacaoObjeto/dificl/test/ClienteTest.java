package OrientacaoObjeto.dificl.test;

import OrientacaoObjeto.dificl.domain.ContaBancaria;

public class ClienteTest {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(101010);
        contaBancaria.depositar(10);
        contaBancaria.imprime();
        contaBancaria.sacar(10);
        contaBancaria.imprime();

    }
}
