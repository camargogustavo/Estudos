package Associacao.medio1N.test;

import Associacao.medio1N.domain.Jogador;
import Associacao.medio1N.domain.Time;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time();
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        time.setNome("Corinthians");
        jogador1.setNome("Gustavo");
        jogador2.setNome("Alana");
        Jogador[] jogadoresTime = new Jogador[2];
        jogadoresTime[0] = jogador1;
        jogadoresTime[1] = jogador2;
        time.setJogadores(jogadoresTime);
        jogador1.setTime(time);
        jogador2.setTime(time);
        time.imprime();
        jogador1.imprime();
        jogador2.imprime();

    }
}
