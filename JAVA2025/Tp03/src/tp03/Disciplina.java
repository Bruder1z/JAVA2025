/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03;

/**
 *
 * @author MauricioAsenjo
 */
public class Disciplina {
private String codigo;
private String nome;
private String carga;

public Disciplina() {}
public void setCodigo(String _codigo) {codigo=_codigo;}
public void setNome(String _nome) {nome=_nome;}
public void setCarga(String _carga) {carga=_carga;}

public String getCodigo() {return codigo;}
public String getNome() {return nome;}
public String getCarga() {return carga;}
    
}
