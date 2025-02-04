import java.util.Scanner;
public class tp01Asenjo {
    //EX 01
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.println("Digite a temperatura em graus Celsius: ");
    //     double temperatura = scanner.nextDouble();

    //     double fahrenheint = temperatura * 1.8 + 32;
    //     System.out.println("Temperatura em Fahrenheint "+ fahrenheint);
    // }

    //EX 02
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.println("Digite suas 4 notas para calcular sua média: ");
    //     double n1 = scanner.nextDouble();
    //     double n2 = scanner.nextDouble();
    //     double n3 = scanner.nextDouble();
    //     double n4 = scanner.nextDouble();

    //     double media = (n1+n2+n3+n4) / 4;

    //     if (media >= 6 ){
    //         System.out.println("Parabens!Você está aprovado");
    //     }else if(media >= 3){
    //         System.out.println("Exame!");
    //     }else{
    //         System.out.println("Reprovado :(");
    //     }
    // }

    //EX 03
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Digite 4 números para realizar sua média geométrica");
    //     double numero1 = scanner.nextDouble();
    //     double numero2 = scanner.nextDouble();
    //     double numero3 = scanner.nextDouble();
    //     double numero4 = scanner.nextDouble();

    //     double mediaGeometrica = (numero1 * numero2 * numero3 * numero4);
    //     double resultado = Math.sqrt(mediaGeometrica);

    //     System.out.println("A Media geometrica dos números digitados é: " +resultado);

        
    // }

    //EX04
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Digite o mês(1 ate 12): ");
         int mes = scanner.nextInt();
         System.out.println("Digite o ano");
         int ano = scanner.nextInt();

         int dias;
         switch (mes) {
             case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                 dias = 31;
                 break;
            case 4: case 6: case 9: case 11:
            dias = 30;
            break;
             default:
                System.out.println("Mês inválido");
                scanner.close();
                return;
         }
         System.out.println("O mes " + mes + " do ano de "+ ano + " tem  " + dias + " dias ");

         scanner.close();
    }
}
