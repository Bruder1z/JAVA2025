/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.enums;

/**
 *
 * @author brudi
 */


    public enum Enums{
        SAO_PAULO ("SP", "SÃO PAULO"),
        RIO_JANEIRO ("RJ", "RIO DE JANEIRO"),
        PIAUI ("PI", "PIAUI"),
        MARANHAO("MA","MARANHAO"),
        MINAS_GERAIS("MG","MINAS GERAIS");
        
        private final  String nome;
        private final String sigla;
        
        private Enums(String sigla, String nome){
             this.sigla = sigla;
                this.nome = nome;
                
        }
         public String getSigla(){
             return sigla;
         }    
          public String getNome(){
             return nome;
         }   
          public String getNomeMaiusculo(){
              return nome.toUpperCase();
          }
                
    }
