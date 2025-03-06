package com.mycompany.desafioprimeirobim;

import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class LivroDAL {
    private static Firestore db;

    public static void conecta() {
        db = FirestoreClient.getFirestore();
    }

    public static void desconecta() {
        db = null;
    }

    public static void inseriLivro(Livro _umlivro) {
        Map<String, Object> livroData = new HashMap<>();
        livroData.put("titulo", _umlivro.getTitulo());
        livroData.put("autor", _umlivro.getAutor());
        livroData.put("editora", _umlivro.getEditora());
        livroData.put("anoEdicao", _umlivro.getAnoEdicao());
        livroData.put("localizacao", _umlivro.getLocalizacao());

        try {
            db.collection("livros").document(_umlivro.getTitulo()).set(livroData).get();
        } catch (InterruptedException | ExecutionException e) {
            Erro.setErro(e.getMessage());
        }
    }

    public static void consultaLivro(Livro _umlivro) {
        try {
            DocumentReference docRef = db.collection("livros").document(_umlivro.getTitulo());
            Map<String, Object> docData = docRef.get().get().getData();
            if (docData != null) {
                _umlivro.setAutor((String) docData.get("autor"));
                _umlivro.setEditora((String) docData.get("editora"));
                _umlivro.setAnoEdicao((String) docData.get("anoEdicao"));
                _umlivro.setLocalizacao((String) docData.get("localizacao"));
            } else {
                Erro.setErro("Livro não localizado.");
            }
        } catch (InterruptedException | ExecutionException e) {
            Erro.setErro(e.getMessage());
        }
    }

    public static void deletaLivro(Livro _umlivro) {
        try {
            db.collection("livros").document(_umlivro.getTitulo()).delete().get();
        } catch (InterruptedException | ExecutionException e) {
            Erro.setErro(e.getMessage());
        }
    }

    public static void alteraLivro(Livro _umlivro) {
        inseriLivro(_umlivro);
    }
}
