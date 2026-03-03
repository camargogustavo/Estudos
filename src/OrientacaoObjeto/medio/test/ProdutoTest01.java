package OrientacaoObjeto.medio.test;

import OrientacaoObjeto.medio.domain.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto = new Produto("notebook",1000,10);
        produto.imprime();
        produto.removeProduto(2);
        produto.imprime();
    }
}