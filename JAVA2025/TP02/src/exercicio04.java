import java.util.Random;

public class exercicio04 {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextInt(100);
        }

        for (int num : numeros){
            if(num % 2 == 0){
                System.out.println(num + " É PAR");
            }else{
                System.out.println(num + " É ÍMPAR");
            }
        }
    }
    
}
