package br.digitalHouse.ListadeExercicios_aula6;

public class Conta {

    private int numeroDaConta;
    private int saldo;
    private Cliente titular;
    private int quantiaDeDinheiro;

    public void deposito (int quantiaDeDinheiro){

        saldo = saldo+ quantiaDeDinheiro;

        System.out.println("Depósito realizado com sucesso " + saldo);

    }

    public boolean saque (int quantiaDeDinheiro){

        saldo = saldo - quantiaDeDinheiro;

        if (saque ()> saldo)

        {
            System.out.println("Saldo insuficiente");
        }
    }
}
