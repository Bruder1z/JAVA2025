import java.text.DecimalFormat;

public class exercicio01 {
    public static void main(String[] args) throws Exception {
        int termos = 15;
        int soma = 0;

        System.out.println("Os Números da série são: ");


        for(int x = 1; x <= termos; x++ ){
            int termo = (x * x) + 1;
            System.out.println(termo + " ");
            soma += termo;
        }

        double mediaAritmetica = (double) soma / termos;

        System.out.println("\nSoma dos termos: " + soma);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Média aritmética dos termos : " + df.format(mediaAritmetica));


        
    }
}
