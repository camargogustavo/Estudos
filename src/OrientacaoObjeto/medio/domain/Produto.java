package OrientacaoObjeto.medio.domain;

public class Produto {
    private String nome;
    private double preco;
    private int quanitdadeEmEstoque;

    public Produto(String nome, double preco, int quanitdadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quanitdadeEmEstoque = quanitdadeEmEstoque;
    }

    public void addProduto(int quantidade){
        this.quanitdadeEmEstoque = quanitdadeEmEstoque + quantidade;
    }
    public void removeProduto(int quantidade){
        this.quanitdadeEmEstoque = quanitdadeEmEstoque- quantidade;
    }

    public void imprime(){
        System.out.println("Informações do Produto");
        System.out.println("Nome: "+getNome());
        System.out.println("Preço: "+getPreco());
        System.out.println("Quantidade: "+getQuanitdadeEmEstoque());
    }

    public int getQuanitdadeEmEstoque() {
        return quanitdadeEmEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
