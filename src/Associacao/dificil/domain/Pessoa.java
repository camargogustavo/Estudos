package Associacao.dificil.domain;

public class Pessoa {
    private String nome;
    private Animal[] pets;

    public void imprime(){
        System.out.println("Relatorio Pets");
        if(nome != null){
            System.out.println("Nome do Dono: "+this.getNome());
            if (pets != null){
                for (Animal nomePet : pets){
                    if (nomePet != null){
                        System.out.println("Nome do pet: "+nomePet.getNome());
                    }
                }
            } else {
                System.out.println("Array de pets esta null");
            }
        } else {
            System.out.println("Nenhum nome de Pessoa foi setado");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Animal[] getPets() {
        return pets;
    }

    public void setPets(Animal[] pets) {
        this.pets = pets;
    }
}
