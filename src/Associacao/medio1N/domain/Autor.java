package Associacao.medio1N.domain;

public class Autor {
    //Um ator tem um nome e muitos livros, entao o Array de livros fica instanciado na classe do autor
    private String nome;
    private Livro[] livros;

    public void imprime() {
        if (nome != null) {
            System.out.println(this.getNome());
            if (livros != null) {
                for (Livro imprimelivros : livros) {
                    System.out.println("Livros: " + imprimelivros.getTitulos());
                }
            } else {
                System.out.println("Este autor nao tem titulos");
            }
        } else {
            System.out.println("O nome do autor está null");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
}
