import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //para numeros
        Scanner sc2 = new Scanner(System.in); // para nomes
        Pessoa p = new Pessoa();
        Profissional pro = new Profissional();
        Cliente c = new Cliente();
        String r;

        do {
            System.out.println("-----CADASTRO-----\n" +
                    "1- Profissional \n" +
                    "2- Cliente ");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.printf("Bem vindo ao cadastro do PROFISSIONAL!");
                    System.out.println("Preencha seus dados");
                    System.out.println("Nome completo: ");
                    pro.setNome(sc2.nextLine());
                    System.out.println("Especialidade:  ");
                    pro.setEspecialidade(sc2.nextLine());
                    System.out.println("Registro profissional:  ");
                    pro.setRegistroProfissional(sc2.nextLine());
                    System.out.printf("CPF:");
                    pro.setCpf(sc2.nextLine());
                    System.out.println("Email:");
                    pro.setEmail(sc2.nextLine());
                    System.out.println("Data de Nascimento: ");
                    pro.setDataNascimento(sc2.nextLine());
                    System.out.println("Telefone: ");
                    pro.setTelefone(sc2.nextLine());
                    System.out.println("Senha: ");
                    pro.setSenha(sc2.nextLine());
                    break;

                case 2:
                    System.out.println("Nome completo: ");
                    c.setNome(sc2.nextLine());
                    System.out.println("CPF:");
                    c.setCpf(sc2.nextLine());
                    System.out.println("Email:");
                    c.setEmail(sc2.nextLine());
                    System.out.println("Data de Nascimento: ");
                    c.setDataNascimento(sc2.nextLine());
                    System.out.println("Telefone: ");
                    c.setTelefone(sc2.nextLine());
                    System.out.println("Senha: ");
                    c.setSenha(sc2.nextLine());
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }
            System.out.println("Cadastro finalizado! \n" +
                    "Para retornar digite S");
            r = sc2.nextLine();
        } while (r.equalsIgnoreCase("S"));


    }
}