/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

/**
 *
 * @author brudi
 */
public class PessoaBLL {
    public static void validaPessoa(char _op, Pessoa _umapessoa)
{
 ErroPessoa.setErro(false);
 if (_umapessoa.getNome().equals(""))
   {ErroPessoa.setErro("O campo Nome é de preenchimento obrigatório..."); return;}
 
 PessoaDAL.conecta();
 if (ErroPessoa.getErro()) return;
 switch (_op)
 {
     case 'c':  PessoaDAL.consultaPessoa(_umapessoa); break;
     case 'd':  PessoaDAL.deletaPessoa(_umapessoa); break;    
 }
 PessoaDAL.desconecta();
}
    public static void validaDados(char _op, Pessoa _umapessoa)
{
 ErroPessoa.setErro(false);
 if (_umapessoa.getCodigo().equals(""))
   {ErroPessoa.setErro("O campo CODIGO é de preenchimento obrigatório..."); return;}
 if (_umapessoa.getNome().equals(""))
   {ErroPessoa.setErro("O campo NOME é de preenchimento obrigatório..."); return;}
 if (_umapessoa.getSexo().equals(""))
   {ErroPessoa.setErro("O campo SEXO é de preenchimento obrigatório..."); return;}
 if (_umapessoa.getIdade().equals(""))
   {ErroPessoa.setErro("O campo IDADE é de preenchimento obrigatório..."); return;}
   try
     {
     Integer.parseInt(_umapessoa.getIdade());
     }
   catch (Exception e)
     {
     ErroPessoa.setErro("O campo Idade deve ser numerico!"); return;
     }

 PessoaDAL.conecta();
 if (ErroPessoa.getErro()) return;
 switch (_op)
 {
     case 'i':  PessoaDAL.inseriPessoa(_umapessoa); break;
     case 'a':  PessoaDAL.alteraPessoa(_umapessoa); break;    
 }
 PessoaDAL.desconecta();
 
}
}

