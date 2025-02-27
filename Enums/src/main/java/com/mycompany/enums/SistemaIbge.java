/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enums;

/**
 *
 * @author brudi
 */
public class SistemaIbge {
    public static void main(String[] args) {
        for(Enums e: Enums.values()){
            System.out.println(e.getSigla() + "-"+ e.getNome());
        }
        Enums eb = Enums.SAO_PAULO;
        
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
    }
}
