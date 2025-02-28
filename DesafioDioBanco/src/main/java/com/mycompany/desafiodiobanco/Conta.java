/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiodiobanco;

/**
 *
 * @author brudi
 */
public abstract class Conta implements IConta {
    
    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    
    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }
    
   
    
    public int getAgencia(){
        return agencia;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public double getSaldo(){
        return saldo;
    }

    
    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    
    @Override
    public void depositar(double valor) {
       saldo = saldo + valor;
    }

   
    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
    protected void imprimirInfosComuns(){
        System.out.println(this.agencia);
        System.out.println(this.numero);
        System.out.println(this.saldo);
    }

}
