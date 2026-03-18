package Associacao.dificil.domain;

public class Animal {
    private String nome;
    private Pessoa dono;


    public void imprime(){
        System.out.println("Relatorio Pet");
        if (nome != null){
            System.out.println("Nome do Animal: "+this.getNome());
            if (dono != null){
                System.out.println("Nome do Dono: "+this.dono.getNome());
            } else {
                System.out.println("Esse pet nao tem dono");
            }
        } else {
            System.out.println("Nome de pet esta null");
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
}
