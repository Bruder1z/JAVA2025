/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.desafiodiobanco;

/**
 *
 * @author brudi
 */
public class NewMain {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(300);
        
        Conta poupança  = new ContaPoupança(); 
        cc.transferir(poupança, 100);
        
       cc.imprimirExtrato();
       poupança.imprimirExtrato();
    }
    
}
