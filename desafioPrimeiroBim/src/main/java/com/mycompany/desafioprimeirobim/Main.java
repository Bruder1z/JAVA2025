/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.desafioprimeirobim;

/**
 *
 * @author brudi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Inicializa o Firebase
        FirebaseConfig.initialize();

        // Abre a interface gráfica (IHM)
        java.awt.EventQueue.invokeLater(() -> {
            new LivroIHM().setVisible(true);
        });
    }
    
}
