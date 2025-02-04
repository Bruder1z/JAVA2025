public class ExemploSwitch{
    public static void main(String[] args) {
        int dia = 3;

        switch (dia) {
            case 1 :
            System.out.println("Domingo");
                break;
            case 2 : 
                System.out.println("Segunda-feira");
                break;
            case 3:
            System.out.println("Terça-Feira");
            break;

            default:
                System.out.println("Outro dia");
        }

    }
}