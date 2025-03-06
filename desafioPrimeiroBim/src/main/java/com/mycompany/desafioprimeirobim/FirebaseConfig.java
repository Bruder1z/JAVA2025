package com.mycompany.desafioprimeirobim;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.auth.oauth2.GoogleCredentials;
import java.io.FileInputStream;
import java.io.IOException;

public class FirebaseConfig { // <- O nome da classe deve ser igual ao nome do arquivo
    public static void initialize() {
        try {
            if (FirebaseApp.getApps().isEmpty()) {
                FileInputStream serviceAccount = new FileInputStream("C:\\Users\\brudi\\OneDrive\\Documentos\\NetBeansProjects\\desafioPrimeiroBim\\desafio01asenjo.json");

                FirebaseOptions options = new FirebaseOptions.Builder()
                        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                        .setDatabaseUrl("https://desafio01asenjo-default-rtdb.firebaseio.com/")
                        .build();

                FirebaseApp.initializeApp(options);
                System.out.println("Firebase inicializado com sucesso!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
