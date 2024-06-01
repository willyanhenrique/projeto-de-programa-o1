import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static CadastroPessoas cadastroPessoas = new CadastroPessoas();
    private static Scanner scanner = new Scanner(System.in);
    private static Cliente cliente;
    private static Profissional profissional;

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        boolean sair = false;
        while (!sair) {
            System.out.println("Bem-vindo ao Sistema de Agendamento!\n" +
                    "1- Cadastrar novo cliente\n" +
                    "2- Cadastrar novo profissional\n" +
                    "3- Fazer login como cliente\n" +
                    "4- Fazer login como profissional\n" +
                    "5- Sair");

            int opcao = -1;
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha pendente
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                scanner.nextLine(); // Consumir a nova linha pendente
            }

            switch (opcao) {
                case 1:
                    cadastrarNovoCliente();
                    break;
                case 2:
                    cadastrarNovoProfissional();
                    break;
                case 3:
                    fazerLoginCliente();
                    break;
                case 4:
                    fazerLoginProfissional();
                    break;
                case 5:
                    sair = true;
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void menuCliente() {
        boolean sair = false;
        while (!sair) {
            System.out.println("Seja bem-vindo! O que você deseja fazer:\n" +
                    "1- Buscar uma nova consulta\n" +
                    "2- Ver consultas agendadas\n" +
                    "3- Cancelar consulta agendada\n" +
                    "4- Avaliar um profissional\n" +
                    "5- Alterar seus dados\n" +
                    "6- Sair");

            int opcao = -1;
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha pendente
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                scanner.nextLine(); // Consumir a nova linha pendente
            }

            switch (opcao) {
                case 1:
                    buscarNovaConsulta();
                    break;
                case 2:
                    listarConsultasAgendadasCliente();
                    break;
                case 3:
                    cancelarConsultaCliente();
                    break;
                case 4:
                    avaliarProfissionalCliente();
                    break;
                case 5:
                    alterarDadosCliente();
                    break;
                case 6:
                    sair = true;
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void menuProfissional() {
        boolean sair = false;
        while (!sair) {
            System.out.println("Seja bem-vindo! O que você deseja fazer:\n" +
                    "1- Ver consultas agendadas\n" +
                    "2- Cancelar consulta agendada\n" +
                    "3- Alterar seus dados\n" +
                    "4- Sair");

            int opcao = -1;
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha pendente
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                scanner.nextLine(); // Consumir a nova linha pendente
            }

            switch (opcao) {
                case 1:
                    listarConsultasAgendadasProfissional();
                    break;
                case 2:
                    cancelarConsultasAgendadasProfissional();
                    break;
                case 3:
                    alterarDadosProfissional();
                    break;
                case 4:
                    sair = true;
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void cadastrarNovoCliente() {
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o CPF do cliente:");
        String cpf = scanner.nextLine();
        System.out.println("Digite a data de nascimento do cliente:");
        String dataNascimento = scanner.nextLine();
        System.out.println("Digite a senha do cliente:");
        String senha = scanner.nextLine();
        System.out.println("Digite o telefone do cliente:");
        String telefone = scanner.nextLine();

        cadastroPessoas.cadastrarCliente(nomeCliente, cpf, dataNascimento, senha, telefone, new ArrayList<>());
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void cadastrarNovoProfissional() {
        System.out.println("Digite o nome do profissional:");
        String nomeProfissional = scanner.nextLine();
        System.out.println("Digite o CPF do profissional:");
        String cpf = scanner.nextLine();
        System.out.println("Digite a data de nascimento do profissional:");
        String dataNascimento = scanner.nextLine();
        System.out.println("Digite a senha do profissional:");
        String senha = scanner.nextLine();
        System.out.println("Digite o telefone do profissional:");
        String telefone = scanner.nextLine();
        System.out.println("Digite a especialidade do profissional:");
        String especialidade = scanner.nextLine();
        System.out.println("Digite o registro profissional do profissional:");
        String registroProfissional = scanner.nextLine();

        cadastroPessoas.cadastrarProfissional(nomeProfissional, cpf, dataNascimento, senha, telefone, especialidade,
                registroProfissional, new ArrayList<>());
        System.out.println("Profissional cadastrado com sucesso!");
    }

    private static void fazerLoginCliente() {
        System.out.println("Digite o CPF do cliente:");
        String cpf = scanner.nextLine();
        System.out.println("Digite a senha do cliente:");
        String senha = scanner.nextLine();

        boolean loginSucesso = false;
        for (Cliente cliente : cadastroPessoas.getClientes()) {
            if (cliente.validarLogin(cpf, senha)) {
                loginSucesso = true;
                Main.cliente = cliente;
                menuCliente();
                break;
            }
        }

        if (!loginSucesso) {
            System.out.println("CPF ou senha incorretos!");
        }
    }

    private static void fazerLoginProfissional() {
        System.out.println("Digite o CPF do profissional:");
        String cpf = scanner.nextLine();
        System.out.println("Digite a senha do profissional:");
        String senha = scanner.nextLine();

        boolean loginSucesso = false;
        for (Profissional profissional : cadastroPessoas.getProfissionais()) {
            if (profissional.validarLogin(cpf, senha)) {
                loginSucesso = true;
                Main.profissional = profissional;
                System.out.println("Login de profissional bem-sucedido!");
                menuProfissional();
                break;
            }
        }

        if (!loginSucesso) {
            System.out.println("CPF ou senha incorretos!");
        }
    }

    private static void buscarNovaConsulta() {
        System.out.println("Digite a especialidade que você está procurando:");
        String especialidade = scanner.nextLine();

        System.out.println("Digite a data que você deseja marcar a consulta (DD/MM/AAAA):");
        String dataConsulta = scanner.nextLine();

        List<Profissional> profissionaisEncontrados = cadastroPessoas.buscarProfissionaisPorEspecialidade(especialidade);
        if (profissionaisEncontrados.isEmpty()) {
            System.out.println("Desculpe, não há profissionais disponíveis para essa especialidade no momento.");
        } else {
            System.out.println("Profissionais disponíveis para a especialidade " + especialidade + ":");
            for (int i = 0; i < profissionaisEncontrados.size(); i++) {
                Profissional prof = profissionaisEncontrados.get(i);
                double mediaAvaliacao = prof.calcularMediaAvaliacao();
                System.out.printf("%d. %s - Média de Avaliação: %.2f%n", (i + 1), prof.getNomeProfissional(), mediaAvaliacao);
            }

            int opcao = -1;
            boolean entradaValida = false;
            while (!entradaValida) {
                System.out.println("Digite o número correspondente ao profissional desejado:");
                try {
                    opcao = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha pendente
                    if (opcao >= 1 && opcao <= profissionaisEncontrados.size()) {
                        entradaValida = true;
                    } else {
                        System.out.println("Opção inválida. Tente novamente.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Por favor, digite um número.");
                    scanner.nextLine(); // Consumir a nova linha pendente
                }
            }

            Profissional profissionalSelecionado = profissionaisEncontrados.get(opcao - 1);
            System.out.println("Você selecionou o profissional " + profissionalSelecionado.getNomeProfissional());

            // Agendando a consulta com o profissional selecionado
            String consultaAgendada = "Consulta com " + profissionalSelecionado.getNomeProfissional() + " em " + dataConsulta;
            profissionalSelecionado.adicionarConsultaAgendada(consultaAgendada);
            cliente.adicionarConsultaAgendada(consultaAgendada); // Adicionando a consulta também ao cliente
            System.out.println("Consulta agendada com sucesso para " + dataConsulta + "!");
        }
    }




    private static void listarConsultasAgendadasCliente() {
        if (cliente.getConsultasAgendadas().isEmpty()) {
            System.out.println("Você não possui consultas agendadas.");
        } else {
            System.out.println("Consultas agendadas:");
            for (String consulta : cliente.getConsultasAgendadas()) {
                System.out.println("- " + consulta);
            }
        }
    }


    private static void cancelarConsultaCliente() {
        if (cliente.getConsultasAgendadas().isEmpty()) {
            System.out.println("Você não possui consultas agendadas para cancelar.");
        } else {
            System.out.println("Consultas agendadas:");
            for (int i = 0; i < cliente.getConsultasAgendadas().size(); i++) {
                System.out.println((i + 1) + ". " + cliente.getConsultasAgendadas().get(i));
            }
            System.out.println("Digite o número correspondente à consulta que deseja cancelar:");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha pendente

            if (opcao >= 1 && opcao <= cliente.getConsultasAgendadas().size()) {
                String consultaCancelada = cliente.getConsultasAgendadas().remove(opcao - 1);
                System.out.println("Consulta \"" + consultaCancelada + "\" cancelada com sucesso.");
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    private static void avaliarProfissionalCliente() {
        System.out.println("Digite o nome do profissional que deseja avaliar:");
        String nomeProfissional = scanner.nextLine();

        Profissional profissionalAvaliacao = null;
        for (Profissional p : cadastroPessoas.getProfissionais()) {
            if (p.getNomeProfissional().equalsIgnoreCase(nomeProfissional)) {
                profissionalAvaliacao = p;
                break;
            }
        }

        if (profissionalAvaliacao == null) {
            System.out.println("Profissional não encontrado!");
            return;
        }

        System.out.println("Digite a nota de avaliação (1 a 5):");
        int nota = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente

        if (nota < 1 || nota > 5) {
            System.out.println("Nota inválida! Deve ser entre 1 e 5.");
            return;
        }

        profissionalAvaliacao.adicionarAvaliacao(nota);
        System.out.println("Avaliação registrada com sucesso!");
    }



    private static void listarConsultasAgendadasProfissional() {
        if (profissional.getConsultasAgendadas().isEmpty()) {
            System.out.println("Você não possui consultas agendadas.");
        } else {
            System.out.println("Consultas agendadas:");
            for (String consulta : profissional.getConsultasAgendadas()) {
                // Dividindo a string da consulta para obter apenas a data
                String[] parts = consulta.split(" em ");
                System.out.println("- Data da consulta: " + parts[1]);
            }
        }
    }

    private static void cancelarConsultasAgendadasProfissional() {
        if (profissional.getConsultasAgendadas().isEmpty()) {
            System.out.println("Você não possui consultas agendadas para cancelar.");
        } else {
            System.out.println("Consultas agendadas:");
            for (int i = 0; i < profissional.getConsultasAgendadas().size(); i++) {
                System.out.println((i + 1) + ". " + profissional.getConsultasAgendadas().get(i));
            }
            System.out.println("Digite o número correspondente à consulta que deseja cancelar:");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha pendente

            if (opcao >= 1 && opcao <= profissional.getConsultasAgendadas().size()) {
                String consultaCancelada = profissional.getConsultasAgendadas().remove(opcao - 1);
                System.out.println("Consulta \"" + consultaCancelada + "\" cancelada com sucesso.");
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }



    private static void alterarDadosCliente() {
        AlteracaoCliente.alterarDadosCliente(cliente, scanner);
    }

    private static void alterarDadosProfissional() {
        AlteracaoProfissional.alterarDadosProfissional(profissional, scanner);
    }
}