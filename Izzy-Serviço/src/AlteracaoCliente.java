import java.util.Scanner;

public class AlteracaoCliente {
    public static void alterarDadosCliente(Cliente cliente, Scanner scanner) {
        System.out.println("O que você deseja alterar:");
        System.out.println("1. Nome");
        System.out.println("2. Data de Nascimento");
        System.out.println("3. Senha");
        System.out.println("4. Telefone");
        System.out.println("5. Voltar");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                alterarNome(cliente, scanner);
                break;
            case 2:
                alterarDataNascimento(cliente, scanner);
                break;
            case 3:
                alterarSenha(cliente, scanner);
                break;
            case 4:
                alterarTelefone(cliente, scanner);
                break;
            case 5:
                System.out.println("Operação cancelada.");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void alterarNome(Cliente cliente, Scanner scanner) {
        System.out.println("Digite o novo nome do cliente:");
        String novoNomeCliente = scanner.nextLine();
        cliente.setNomeCliente(novoNomeCliente);
        System.out.println("Nome do cliente atualizado com sucesso!");
    }

    private static void alterarDataNascimento(Cliente cliente, Scanner scanner) {
        System.out.println("Digite a nova data de nascimento do cliente:");
        String novaDataNascimento = scanner.nextLine();
        cliente.setDataNascimento(novaDataNascimento);
        System.out.println("Data de nascimento do cliente atualizada com sucesso!");
    }

    private static void alterarSenha(Cliente cliente, Scanner scanner) {
        System.out.println("Digite a nova senha do cliente:");
        String novaSenha = scanner.nextLine();
        cliente.setSenha(novaSenha);
        System.out.println("Senha do cliente atualizada com sucesso!");
    }

    private static void alterarTelefone(Cliente cliente, Scanner scanner) {
        System.out.println("Digite o novo telefone do cliente:");
        String novoTelefone = scanner.nextLine();
        cliente.setTelefone(novoTelefone);
        System.out.println("Telefone do cliente atualizado com sucesso!");
    }
}