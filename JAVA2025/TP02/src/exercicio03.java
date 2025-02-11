import  java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números da Série de Fibonacci gostaria de saber?");
        int numSerie = scanner.nextInt();

        int anterior = 0, atual =1;
        System.out.println("Série de Fibonacci: ");
       

        for (int x = 0; x < numSerie; x++){
            System.out.println(anterior + " ");

            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

    }
}
