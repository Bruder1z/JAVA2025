import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Banco Bruder");

        System.out.println("Digite o número da Agência: ");
        int agencia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o Número da sua conta: ");
        int numeroCc = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o saldo inicial da sua conta corrente: ");
        double saldo = scanner.nextDouble();

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Depositar dinheiro");
            System.out.println("2 - Sacar dinheiro");
            System.out.println("3 - Exibir saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    saldo = depositar(scanner, saldo);
                    break;
                case 2:
                    saldo = sacar(scanner, saldo);
                    break;
                case 3:
                    System.out.println("Saldo atual: R$" + saldo);
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar o Banco Bruder!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();

        System.out.println("nome: "+ nome);
        System.out.println("agencia: " + agencia);
        System.out.println("numero da conta: " + numeroCc);
        System.out.println("saldo: " + saldo);
    }

    public static double depositar(Scanner scanner, double saldo) {
        System.out.print("Digite o valor a depositar: ");
        double valor = scanner.nextDouble();
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido!");
        }
        return saldo;
    }

    public static double sacar(Scanner scanner, double saldo) {
        System.out.print("Digite o valor a sacar: ");
        double valor = scanner.nextDouble();
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
        return saldo;
    }

}
