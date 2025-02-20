/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanchonete.atendimento.Cliente;

/**
 *
 * @author brudi
 */
public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionar lanche natural no balcão");
    }
     public void adicionarSucoNoBalcao(){
        System.out.println("Adicionar suco natural no balcão");
    }
     
      public void adicionarComboNoBalcao(){
        System.out.println("Adicionar combo no balcão");
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
      
      public void prepararLanche(){
          System.out.println("Preparando hamburguer");
      }
      
      public void prepararVitamina(){
          System.out.println("preparando vitamina");
      }
      
      public void prepararCombo(){
          prepararLanche();
          prepararVitamina();
      }
      
      public void selecionarIngredientesLanche(){
          System.out.println("selecionando pao, salada, queijo e carne");
      }
      
      public void selecionarIngredientesVitamina(){
          System.out.println("selecionando fruta, leite e suco");
      }
    
}
