package Associacao.medio1N.domain;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime(){
        System.out.println("Relatorio do jogador");
        if (nome != null){
            System.out.println("Nome: "+this.getNome());
            if (time != null){
                System.out.println("Nome do time: "+this.time.getNome());
            } else {
                System.out.println("Este jogador não tem um time");
            }
        } else {
            System.out.println("Nome de jogador esta null"+getNome());
        }
        System.out.println("---------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
