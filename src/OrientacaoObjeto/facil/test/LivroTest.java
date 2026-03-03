package OrientacaoObjeto.facil.test;

import OrientacaoObjeto.facil.domain.Livro;

public class LivroTest {
    public static void main(String[] args) {
        Livro livro = new Livro("48 leis do poder","EU",200);
        livro.imprime();
    }
}
