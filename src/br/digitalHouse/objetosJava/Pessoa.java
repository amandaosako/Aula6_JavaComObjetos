package br.digitalHouse.objetosJava;

public class Pessoa {

    private String nomePessoa;

    public Pessoa (String novoNome){
        nomePessoa = novoNome;
    }

    //get
    public String getNomePessoa (){
        return nomePessoa;

    }

    //set

    public void setNomePessoa (String novoNome){
        nomePessoa = novoNome;

    }
}
