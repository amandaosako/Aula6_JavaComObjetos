package br.digitalHouse.objetosJava;

public class Principal {

    public static void main(String[] args) {

        Animal animalMamifero;
        animalMamifero = new Animal("Bidu");

        System.out.println(animalMamifero.getNomeAnimal());

        // System.out.println(animalMamifero.raca);
        // System.out.println(animalMamifero.idade);
        // System.out.println(animalMamifero.cor);

        Animal animalDomestico = new Animal();
        animalDomestico.setNomeAnimal("Ted");
        System.out.println(animalDomestico.getNomeAnimal());

        System.out.println("************************");

        Pessoa pessoaJovem = new Pessoa ("Erika");

        System.out.println(pessoaJovem.getNomePessoa());

        animalDomestico.setDonoAnimal(pessoaJovem);

        System.out.println(animalDomestico.getDonoAnimal().getNomePessoa());

        Pessoa pessoaIdosa = new Pessoa("Clotilde");

        animalDomestico.setDonoAnimal(pessoaIdosa);
    }
}
