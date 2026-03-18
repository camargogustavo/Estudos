package Associacao.medio1N.test;

import Associacao.medio1N.domain.Autor;
import Associacao.medio1N.domain.Livro;

public class LivroTest {
    public static void main(String[] args) {
        Autor autor = new Autor();
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        autor.setNome("Gustavo");
        livro1.setTitulos("Biblia");
        livro2.setTitulos("Minha Vida");
        Livro[] livrosAutor = new Livro[2];
        livrosAutor[0] = livro1;
        livrosAutor[1] = livro2;
        autor.setLivros(livrosAutor);
        livro1.setAutor(autor);
        livro2.setAutor(autor);
        autor.imprime();
        livro1.imprime();
    }
}
