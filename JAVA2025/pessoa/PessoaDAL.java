/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

/**
 *
 * @author brudi
 */
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class PessoaDAL {
    private static ObjectContainer db;
    
public static void conecta()
{
try {
    db = Db4o.openFile("meubanco.dbo");
  }
catch (Exception e) {
  ErroPessoa.setErro(e.getMessage());
  }
}
public static void desconecta()
{
try {
  db.close();
  }
catch (Exception e) {
  ErroPessoa.setErro(e.getMessage());
  }
}
public static void inseriPessoa(Pessoa _umapessoa)
{
  ErroPessoa.setErro(false);
  try {
      db.set(_umapessoa);
  }
  catch(Exception e){
    ErroPessoa.setErro(e.getMessage());
  } 
}
public static void consultaPessoa(Pessoa _umapessoa)
{
  ObjectSet<Pessoa> lista;
    
  ErroPessoa.setErro(false);
  try {
    lista = db.get(_umapessoa);
    if (lista.hasNext())
    {
        Pessoa aux = lista.next();
        _umapessoa.setCodigo(aux.getCodigo());
        _umapessoa.setNome(aux.getNome());
        _umapessoa.setSexo(aux.getSexo());
        _umapessoa.setIdade(aux.getIdade());
    }
    else
    {
        ErroPessoa.setErro("Pessoa nao localizada.");
    }
  }
  catch(Exception e){
    ErroPessoa.setErro(e.getMessage());
  } 
}

public static void deletaPessoa(Pessoa _umapessoa)
{
  ObjectSet<Pessoa> lista;
    
  ErroPessoa.setErro(false);
  try {
    lista = db.get(_umapessoa);
    if (lista.hasNext())
    {
        _umapessoa = lista.next();
        db.delete(_umapessoa);
    }
    else
    {
        ErroPessoa.setErro("Pessoa não localizada."); 
        
    }
  }
  catch(Exception e){
    ErroPessoa.setErro(e.getMessage());
  } 
}

public static void alteraPessoa(Pessoa _umapessoa)
{
  ObjectSet<Pessoa> lista;
  Pessoa consulta = new Pessoa();
  consulta.setNome(_umapessoa.getNome());
    
  ErroPessoa.setErro(false);
  try {
    lista = db.get(consulta);
    if (lista.hasNext())
    {
        consulta = lista.next();
        consulta.setCodigo(_umapessoa.getCodigo());
        consulta.setNome(_umapessoa.getNome());
        consulta.setSexo(_umapessoa.getSexo());
        consulta.setIdade(_umapessoa.getIdade());
        db.set(consulta);
    }
    else
    {
        ErroPessoa.setErro("Pessoa nao localizado.");
    }
  }
  catch(Exception e){
    ErroPessoa.setErro(e.getMessage());
  } 
} 

}
