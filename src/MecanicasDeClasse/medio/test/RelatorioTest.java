package MecanicasDeClasse.medio.test;

import MecanicasDeClasse.medio.domain.Relatorio;

public class RelatorioTest {
    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio();
        relatorio.exibir();
        relatorio.exibir("Java");
        relatorio.exibir("Javas",10);
    }
}
