package Associacao.medio1N.domain;

public class Livro {
    private Autor autor;
    private String titulos;

    public void imprime(){
        if (titulos != null){
            System.out.println("Titulo: "+this.titulos);
            if (autor != null){
                System.out.println("Autor: "+this.autor.getNome());
            } else {
                System.out.println("Autor nao cadastrado");
            }
        }
    }
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }
}
