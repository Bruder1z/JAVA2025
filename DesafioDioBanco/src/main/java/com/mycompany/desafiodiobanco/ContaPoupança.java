package com.mycompany.desafiodiobanco;

public class ContaPoupança extends Conta {
    @Override
    public void imprimirExtrato() {
     System.out.println("Extrato Cp:");
      super.imprimirInfosComuns();
    }
}
