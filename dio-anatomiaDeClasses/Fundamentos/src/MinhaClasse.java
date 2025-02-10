

public class MinhaClasse {
    
  public static void main(String[] args) {
      
       String meuNome = "Lucas";

       int anoFabricacao = 2022;

       boolean verdadeira = true;

       anoFabricacao = 2018;

       String primeiroNome = "Lucas";

       String segundoNome = "Bruder";

       String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
       System.out.println(nomeCompleto);

       
  } 

  public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);
  }

}
