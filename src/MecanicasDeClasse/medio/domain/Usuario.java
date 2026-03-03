package MecanicasDeClasse.medio.domain;

public class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.email);
        System.out.println(this.senha);
    }

}
