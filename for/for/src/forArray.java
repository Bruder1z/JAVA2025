public class forArray{
    public static void main(String[] args) {
        String alunos[] = {"Lucas", "Manu", "Davi", "Luiza", "Fildo"};

        for(int x=0; x<alunos.length; x++){
            System.out.println("O aluno do indice: " + x + " é " + alunos[x]);
        }

        //forma abreviada
        for (String aluno : alunos){
            System.out.println(aluno);
        }
    }
}