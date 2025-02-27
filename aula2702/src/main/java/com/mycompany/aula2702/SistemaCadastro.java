
package com.mycompany.aula2702;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa manu = new Pessoa("123", "manu");
        
        manu.setEndereco("rua waldomiro silveira");
        
        System.out.println(manu.getNome() + "-"+manu.getCpf());
    }
}
