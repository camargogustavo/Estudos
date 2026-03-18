package Associacao.dificil.test;

import Associacao.dificil.domain.Animal;
import Associacao.dificil.domain.Pessoa;

public class PetTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        pessoa.setNome("Gustavo");
        animal1.setNome("Fumaca");
        animal2.setNome("Faisca");
        animal3.setNome("Fogo");
        Animal[] listaPets = new Animal[2];
        listaPets[0] = animal1;
        listaPets[1] = animal2;
        pessoa.setPets(listaPets);
        animal1.setDono(pessoa);
        animal2.setDono(pessoa);
        pessoa.imprime();
        System.out.println("----");
        animal1.imprime();
        System.out.println("----");
        animal2.imprime();
        System.out.println("----");
        animal3.imprime();
    }
}
