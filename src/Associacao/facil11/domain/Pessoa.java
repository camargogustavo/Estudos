package Associacao.facil11.domain;

public class Pessoa {
    private String nome;
    private RG rg;

    public void imprime(){
        System.out.println(getNome());
        System.out.println(rg.getNumero());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RG getRg() {
        return rg;
    }

    public void setRg(RG rg) {
        this.rg = rg;
    }

}
