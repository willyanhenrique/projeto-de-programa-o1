import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Pessoa cliente = new Cliente("Alice", "alice@example.com");
        Profissional profissional = new Profissional("Bob", "bob@example.com", "Engenharia");


        System.out.println("Informações iniciais:");
        cliente.mostrarInformacoes();
        profissional.mostrarInformacoes();

        System.out.println("\nEscolha a opção para alterar os dados:");
        System.out.println("1. Cliente");
        System.out.println("2. Profissional");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:

                System.out.print("Digite o novo nome do Cliente: ");
                String novoNomeCliente = scanner.nextLine();
                cliente.setNome(novoNomeCliente);

                System.out.print("Digite o novo email do Cliente: ");
                String novoEmailCliente = scanner.nextLine();
                cliente.setEmail(novoEmailCliente);

                System.out.println("\nInformações do Cliente após alterações:");
                cliente.mostrarInformacoes();
                break;

            case 2:
                System.out.print("Digite o novo nome do Profissional: ");
                String novoNomeProfissional = scanner.nextLine();
                profissional.setNome(novoNomeProfissional);

                System.out.print("Digite o novo email do Profissional: ");
                String novoEmailProfissional = scanner.nextLine();
                profissional.setEmail(novoEmailProfissional);

                System.out.print("Digite a nova área de atuação do Profissional: ");
                String novaAreaAtuacao = scanner.nextLine();
                profissional.setAreaAtuacao(novaAreaAtuacao);

                System.out.println("\nInformações do Profissional após alterações:");
                profissional.mostrarInformacoes();
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}
