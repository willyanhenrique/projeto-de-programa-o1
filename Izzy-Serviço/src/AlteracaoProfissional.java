import java.util.Scanner;

public class AlteracaoProfissional {
    public static void alterarDadosProfissional(Profissional profissional, Scanner scanner) {
        System.out.println("O que você deseja alterar:");
        System.out.println("1. Nome");
        System.out.println("2. Data de Nascimento");
        System.out.println("3. Senha");
        System.out.println("4. Telefone");
        System.out.println("6. Voltar");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                alterarNome(profissional, scanner);
                break;
            case 2:
                alterarDataNascimento(profissional, scanner);
                break;
            case 3:
                alterarSenha(profissional, scanner);
                break;
            case 4:
                alterarTelefone(profissional, scanner);
                break;
            case 5:
                System.out.println("Operação cancelada.");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }



    private static void alterarNome(Profissional profissional, Scanner scanner) {
        System.out.println("Digite o novo nome do profissional:");
        String novoNomeProfissional = scanner.nextLine();
        profissional.setNomeProfissional(novoNomeProfissional);
        System.out.println("Nome do profissional atualizado com sucesso!");
    }

    private static void alterarDataNascimento(Profissional profissional, Scanner scanner) {
        System.out.println("Digite a nova data de nascimento do profissional:");
        String novaDataNascimento = scanner.nextLine();
        profissional.setDataNascimento(novaDataNascimento);
        System.out.println("Data de nascimento do profissional atualizada com sucesso!");
    }

    private static void alterarSenha(Profissional profissional, Scanner scanner) {
        System.out.println("Digite a nova senha do profissional:");
        String novaSenha = scanner.nextLine();
        profissional.setSenha(novaSenha);
        System.out.println("Senha do profissional atualizada com sucesso!");
    }

    private static void alterarTelefone(Profissional profissional, Scanner scanner) {
        System.out.println("Digite o novo telefone do profissional:");
        String novoTelefone = scanner.nextLine();
        profissional.setTelefone(novoTelefone);
        System.out.println("Telefone do profissional atualizado com sucesso!");
    }

}