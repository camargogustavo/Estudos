package OrientacaoObjeto.facil.domain;

public class Livro {
    private String nome;
    private String autor;
    private int paginas;

    public Livro(String nome, String autor, int paginas) {
        this.nome = nome;
        this.autor = autor;
        this.paginas = paginas;
    }
    public void imprime(){
        System.out.println("informações do Livro");
        System.out.println("Nome do Livro: "+getNome());
        System.out.println("Nome do Autor: "+getAutor());
        System.out.println("Quantidade de paginas: "+getPaginas());
    }
    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }


}
