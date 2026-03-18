package Castings.test;

public class TestWidening {
    public static void main(String[] args) {
        byte b = 10;
        int i = b;      // byte cabe no int

        long l = i;     // int cabe no long
        double d = l;
        System.out.println("Inteiro: " + i);
        System.out.println("Double: " + d);

        // Desafio do char: todo caractere tem um número por trás (ASCII/Unicode)
        char letra = '&';
        int numeroLetra = letra;
        System.out.println("O número da letra "+letra+" é: " + numeroLetra);// long cabe no double (vira 10.0)

    }
}
