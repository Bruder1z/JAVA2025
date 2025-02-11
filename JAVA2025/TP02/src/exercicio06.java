import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] agenda = new String[5][4];
        int opcao;

        do {
            System.out.println("\n=== Consultório Sou Raiz ===");
            System.out.println("1 - Agendar");
            System.out.println("2 - Listar Agenda");
            System.out.println("3 - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    agendar(agenda, scanner);
                    break;
                case 2:
                    listarAgenda(agenda);
                    break;
                case 3:
                    System.out.println("Saindo... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    // Método para agendar um paciente
    public static void agendar(String[][] agenda, Scanner scanner) {
        System.out.print("Digite o nome do paciente: ");
        String paciente = scanner.nextLine();

        System.out.print("Digite o dia (2-Seg, 3-Ter, 4-Qua, 5-Qui, 6-Sex): ");
        int dia = scanner.nextInt();

        System.out.print("Digite o horário (8, 9, 10, 11): ");
        int horario = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Validação dos inputs
        if (dia < 2 || dia > 6 || horario < 8 || horario > 11) {
            System.out.println("Erro: Dia ou horário inválido!");
            return;
        }

        int diaIndex = dia - 2;
        int horarioIndex = horario - 8;

        if (agenda[diaIndex][horarioIndex] == null) {
            agenda[diaIndex][horarioIndex] = paciente;
            System.out.println(" Agendamento realizado com sucesso! Ferro nela!");
        } else {
            System.out.println("Erro! Horário já está ocupado.");
        }
    }

    // Método para listar os horários ocupados
    public static void listarAgenda(String[][] agenda) {
        String[] diasSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};
        int[] horarios = {8, 9, 10, 11};

        System.out.println("\n=== AGENDA ===");
        for (int i = 0; i < agenda.length; i++) {
            System.out.println(diasSemana[i] + ":");
            boolean diaVazio = true;
            for (int j = 0; j < agenda[i].length; j++) {
                if (agenda[i][j] != null) {
                    System.out.println( horarios[j] + "h - " + agenda[i][j]);
                    diaVazio = false;
                }
            }
            if (diaVazio) {
                System.out.println(" Nenhum horário agendado.");
            }
        }
    }
}
