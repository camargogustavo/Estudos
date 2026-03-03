package MecanicasDeClasse.facil.domain;

public class Carro {
    private static int totalCarrosCriado;

    public Carro() {
        totalCarrosCriado++;
    }
    public void imprime(){
        System.out.println(totalCarrosCriado);
    }
}

