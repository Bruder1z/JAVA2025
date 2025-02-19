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
public class DisciplinaBLL {
public static void validaDados(Disciplina umaDisciplina)
{
 Erro.setErro(false);
 if (umaDisciplina.getCodigo().equals(""))
   {Erro.setErro("O campo Codigo é de preenchimento obrigatório..."); return;}
 if (umaDisciplina.getNome().equals(""))
   {Erro.setErro("O campo Nome é de preenchimento obrigatório..."); return;}
 if (umaDisciplina.getCarga().equals(""))
   {Erro.setErro("O campo Carga Horaria é de preenchimento obrigatório..."); return;}
 else
   try
     {
     Integer.parseInt(umaDisciplina.getCarga());
     }
   catch (Exception e)
     {
     Erro.setErro("O campo Carga Horaria deve ser numerico!"); return;
     }
 DisciplinaDAL.conecta("Disciplina.mdb");
 if (Erro.getErro()) return;
 DisciplinaDAL.inserirDisciplina(umaDisciplina);
 if (Erro.getErro()) return;
 DisciplinaDAL.desconecta();
}    

public static void validaCodigo(Disciplina umaDisciplina, char op)
{
 Erro.setErro(false);
 if (umaDisciplina.getCodigo().equals(""))
   {Erro.setErro("O campo Codigo é de preenchimento obrigatório..."); return;}
 DisciplinaDAL.conecta("Disciplina.mdb");
 if (Erro.getErro()) return;
 if (op == 'c')
    DisciplinaDAL.consultarDisciplina(umaDisciplina);
 else if (op == 'd')
    DisciplinaDAL.deletarDisciplina(umaDisciplina);
 else 
     DisciplinaDAL.atualizarDisciplina(umaDisciplina);
     
 if (Erro.getErro()) return;
 DisciplinaDAL.desconecta();
}
}
