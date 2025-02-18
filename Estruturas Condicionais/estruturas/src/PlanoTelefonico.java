public class PlanoTelefonico {
    public static void main(String[] args) {
        String plano = "T";

        switch (plano) {
            case "M":{
                System.out.println("100 min de ligação");
                break;
            }
            case "T":{
                System.out.println("Whats e Instagram gratuitos");
                System.out.println("100 min de ligação");
                break;
            }
            case "B":{
                System.out.println("Whats e Instagram gratuitos");
                System.out.println("100 min de ligação");
                System.out.println("5GB DE YOUTUBE");
                break;
            }
            default:
                System.out.println("Plano invalido");
                break;
        }
    }
}
