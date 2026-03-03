package MecanicasDeClasse.dificil.test;

import MecanicasDeClasse.dificil.domain.Inimigo;

public class InimigoTest {
    public static void main(String[] args) {
        Inimigo inimigo = new Inimigo("Gustavo",100);
        inimigo.imprime();
        inimigo.exibirStatus();
        Inimigo.alterarDificuldadeGlobal(10);
        inimigo.exibirStatus();
    }


}
