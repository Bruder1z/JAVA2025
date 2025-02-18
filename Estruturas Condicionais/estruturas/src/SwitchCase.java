public class SwitchCase {
    public static void main(String[] args) {
        String sigla = "M";

        //normal
        // if (sigla == "P")
        //     System.out.println("PEQUENO");
        // else if(sigla == "M")
        //     System.out.println("Medio");
        // else if (sigla == "G")
        //     System.out.println("Grande");
        // else
        // System.out.println("Indefinido");

        switch (sigla) {
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Médio");
                break;
            }
            case "G":{
                System.out.println("Grande");
            }
            default:
               System.out.println("Indefinido");
        }

    }
}
