package Castings.test;

public class TestCasting {
    public static void main(String[] args) {
        long numeroGrande = 2147483648L;
        int castNumero = (int) numeroGrande;
        System.out.println(numeroGrande);
        System.out.println(castNumero);
    }
}
