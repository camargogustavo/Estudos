package Associacao.medio1N.domain;

public class Time {
    private Jogador[] jogadores;
    private String nome;

    public void imprime() {
        System.out.println("Relatorio do Time");
        if (nome != null) {
            System.out.println("Nome do Time: "+this.getNome());
            System.out.println("--- Jogadores ---");
            if (jogadores != null) {
                for (Jogador jogador : jogadores) {
                    if (jogador != null) {
                        System.out.println("Nome: " + jogador.getNome());
                    }
                }
            } else {
                System.out.println("Array de jogadores esta null");
            }
        } else {
            System.out.println("Nome de referencia de time esta: " + this.getNome());
        }
        System.out.println("---------");

    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
