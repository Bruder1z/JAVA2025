/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.desafiodiobanco;

/**
 *
 * @author brudi
 */
public interface IConta {
    public void sacar(double valor);
        
    public void depositar(double valor);
        
    public void transferir(Conta contaDestino, double valor);
    
    void imprimirExtrato();
    
}
