package PolimorfismoHeranca.test;

import PolimorfismoHeranca.domain.Animal;
import PolimorfismoHeranca.domain.Cachorro;
import PolimorfismoHeranca.domain.Gato;

public class AnimalTest {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Zeus", "Pitbull");
        Gato gato = new Gato("Fumaca", "De Rua");

        Animal[] listaAnimal = {cachorro,gato};


        for (Animal emitirSom: listaAnimal ){
            if (emitirSom != null){
                emitirSom.emitirSom();
                System.out.println("Nome: "+emitirSom.getNome());
                if (emitirSom instanceof Cachorro dog){
                    System.out.println("Raça: "+dog.getRaca());
                } else if (emitirSom instanceof Gato cat) {
                    System.out.println("Raça: "+cat.getRaca());
                }
                System.out.println("--- --- ---");
            }
        }
    }
}
