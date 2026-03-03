package OrientacaoObjeto.facil.test;

import OrientacaoObjeto.facil.domain.Lampada;

public class LampadaTest {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.ligada();
        lampada.imprime();
        System.out.println("\n");
        lampada.desligada();
        lampada.imprime();
    }
}
