package escola;

public class Escola {
    public static void main(String[] args){
        Aluno lucas = new Aluno();
        lucas.setNome("Lucas");
        lucas.setIdade(20);
        
        System.out.println("O ALUNO " + lucas.getNome() + " tem " + lucas.getIdade() + " anos.");
    }
}
