package com.mycompany.desafioprimeirobim;

public class LivroBLL {
    public static void validaTitulo(char _op, Livro _umlivro) {
        Erro.setErro(false);
        if (_umlivro.getTitulo().equals("")) {
            Erro.setErro("O campo TITULO é de preenchimento obrigatório...");
            return;
        }

        LivroDAL.conecta();
        if (Erro.getErro()) return;

        switch (_op) {
            case 'c' -> LivroDAL.consultaLivro(_umlivro);
            case 'd' -> LivroDAL.deletaLivro(_umlivro);    
        }
        LivroDAL.desconecta();
    }

    public static void validaDados(char _op, Livro _umlivro) {
        Erro.setErro(false);
        if (_umlivro.getTitulo().equals("")) {
            Erro.setErro("O campo TITULO é de preenchimento obrigatório...");
            return;
        }
        if (_umlivro.getAutor().equals("")) {
            Erro.setErro("O campo AUTOR é de preenchimento obrigatório...");
            return;
        }
        if (_umlivro.getEditora().equals("")) {
            Erro.setErro("O campo EDITORA é de preenchimento obrigatório...");
            return;
        }
        if (_umlivro.getAnoEdicao().equals("")) {
            Erro.setErro("O campo ANO EDICAO é de preenchimento obrigatório...");
            return;
        } else {
            try {
                Integer.valueOf(_umlivro.getAnoEdicao());
            } catch (NumberFormatException e) {
                Erro.setErro("O campo ANO EDICAO deve ser numérico!");
                return;
            }
        }
        if (_umlivro.getLocalizacao().equals("")) {
            Erro.setErro("O campo LOCALIZACAO é de preenchimento obrigatório...");
            return;
        }

        LivroDAL.conecta();
        if (Erro.getErro()) return;

        switch (_op) {
            case 'i' -> LivroDAL.inseriLivro(_umlivro);
            case 'a' -> LivroDAL.alteraLivro(_umlivro);    
        }
        LivroDAL.desconecta();
    }
}
