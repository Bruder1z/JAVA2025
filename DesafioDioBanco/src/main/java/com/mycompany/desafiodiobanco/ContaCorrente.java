package com.mycompany.desafiodiobanco;

public class ContaCorrente extends Conta {

   
    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato CC:");
        super.imprimirInfosComuns();
    }
 }
