import java.util.concurrent.ThreadLocalRandom;//gera os números aleatorios

public class WhileRigth {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

                System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho");
                mesada = mesada - valorDoce;

                
        }
        System.out.println("Mesada: " + mesada);
                System.out.println("Jzin gastou toda sua mesada");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
