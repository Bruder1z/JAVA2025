package pessoa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brudi
 */
public class Pessoa {
private String codigo;
private String nome;
private String sexo;
private String idade;

public Pessoa() {}
public void setCodigo(String _codigo) {codigo=_codigo;}
public void setNome(String _nome) {nome=_nome;}
public void setSexo(String _sexo) {sexo=_sexo;}
public void setIdade(String _idade) {idade = _idade;}

public String getCodigo() {return codigo;}
public String getNome() {return nome;}
public String getSexo() {return sexo;}
public String getIdade() {return idade;}
}
