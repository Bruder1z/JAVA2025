/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03;

import java.sql.*;

/**
 *
 * @author unisanta
 */
public class DisciplinaDAL {

    private static Connection con;

    public static void conecta(String _bd) {
        Erro.setErro(false);
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://" + _bd);
        } catch (Exception e) {
            Erro.setErro(e.getMessage());
        }
    }

    public static void desconecta() {
        Erro.setErro(false);
        try {
            con.close();
        } catch (Exception e) {
            Erro.setErro(e.getMessage());
        }
    }

    public static void inserirDisciplina(Disciplina umaDisciplina) {
        Erro.setErro(false);
        try {
            PreparedStatement st = con.prepareStatement("insert into TabDisciplinas (codigo,nome,carga) values (?,?,?)");
            st.setString(1, umaDisciplina.getCodigo());
            st.setString(2, umaDisciplina.getNome());
            st.setString(3, umaDisciplina.getCarga());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            Erro.setErro(e.getMessage());
        }
    }

    public static void consultarDisciplina(Disciplina umaDisciplina) {
        ResultSet rs;

        try {
            PreparedStatement st = con.prepareStatement("SELECT * FROM TabDisciplinas WHERE codigo=?");
            st.setString(1, umaDisciplina.getCodigo());
            rs = st.executeQuery();
            if (rs.next()) {
                umaDisciplina.setNome(rs.getString("nome"));
                umaDisciplina.setCarga(rs.getString("carga"));
            } else {
                Erro.setErro("Disciplina nao localizada.");
                return;
            }
            st.close();
        } catch (Exception e) {
            Erro.setErro(e.getMessage());
        }
    }

    public static void deletarDisciplina(Disciplina umaDisciplina) {
        Erro.setErro(false);
        ResultSet rs;
        try {
            PreparedStatement st = con.prepareStatement("DELETE * FROM TabDisciplinas WHERE codigo=?");
     
            st.setString(1, umaDisciplina.getCodigo());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            Erro.setErro(e.getMessage());
        }
    }
    
    public static void atualizarDisciplina(Disciplina umaDisciplina) {
        Erro.setErro(false);
        ResultSet rs;
        try {
            PreparedStatement st = con.prepareStatement("UPDATE TabDisciplinas SET codigo=?, nome=?, carga=? WHERE codigo=?");
     
            st.setString(1, umaDisciplina.getCodigo()); 
            st.setString(2, umaDisciplina.getNome());   
            st.setString(3, umaDisciplina.getCarga());      
            st.setString(4, umaDisciplina.getCodigo());  
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            Erro.setErro(e.getMessage());
        }
    }
    
    
}
