package Castings.test;

public class TestNarrowing {
    public static void main(String[] args) {
        double preco = 9.99;
        int precoInteiro = (int) preco; // Perde o .99

        int numero = 130;
        byte numeroByte = (byte) numero; // Estoura o limite (127) e "dá a volta"

        System.out.println("Preço cortado: " + precoInteiro);
        System.out.println("Byte estourado: " + numeroByte);
    }
}
