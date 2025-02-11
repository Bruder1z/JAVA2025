import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é um número perfeito: ");
        int numero = scanner.nextInt();

        int soma = 0;
        

        for (int x = 1; x < numero; x++ ){
            if(numero % x == 0){
                soma += x;
            }
        }

        if (soma == numero){
            System.out.println("Número Perfeito");
        }else{
            System.out.println("Este número nao é Perfeito");
        }
        
    }
    
}
