/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanchonete;

import lanchonete.atendimento.Cliente.Cozinheiro;
import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Cliente.Almoxarife;
import lanchonete.atendimento.Cliente.Atendente;

/**
 *
 * @author brudi
 */
public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        
        
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();
        
        
        
        Almoxarife almoxarife = new Almoxarife();
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        almoxarife.trocarGas();
    
        Atendente atendente = new Atendente();
        atendente.servindoMesa();
        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        
       
        
        Cliente cliente = new Cliente();
        cliente.escolhendoLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
        
    }
        
    }
    
