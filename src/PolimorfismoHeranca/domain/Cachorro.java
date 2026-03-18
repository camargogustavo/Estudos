package PolimorfismoHeranca.domain;

public final class Cachorro extends Animal{
    private String raca;
    public Cachorro(String nome) {
        super(nome);
    }

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    @Override
    public void comer() {
        System.out.println("Comendo ração");
    }

    @Override
    public void emitirSom() {
        System.out.println("AUAU");
    }

    public String getRaca() {
        return raca;
    }
}
