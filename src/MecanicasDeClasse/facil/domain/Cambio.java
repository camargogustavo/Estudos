package MecanicasDeClasse.facil.domain;

public class Cambio {
    private static double taxaDolar = 5.0;

    public static void converterParaReal(double valor){
        double realDollar = valor * taxaDolar;
        System.out.println(realDollar);
    }
}
