package MecanicasDeClasse.dificil.domain;

public class Inimigo {
    private String nome;
    private int hp;
    private static int multiplicadorDificuldade;

    static {
        multiplicadorDificuldade = 1;
    }

    public Inimigo(String nome, int hp) {
        this.nome = nome;
        this.hp = hp;
    }

    public static void alterarDificuldadeGlobal(int novoValor){
        multiplicadorDificuldade = novoValor;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.hp);
    }
    public void exibirStatus(){
        System.out.println(multiplicadorDificuldade);
    }
}
