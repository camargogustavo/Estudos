package PolimorfismoHeranca.domain;

public class Gato extends Animal{
    private String raca;
    public Gato(String nome) {
        super(nome);
    }

    public Gato(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    @Override
    public void comer() {
        System.out.println("Comendo peixe");
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau Miau");
    }

    public String getRaca() {
        return raca;
    }
}
