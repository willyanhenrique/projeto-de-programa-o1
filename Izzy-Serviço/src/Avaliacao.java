import java.util.Scanner;
class Avaliacao {
    private int cortesia;
    private int eficiencia;
    private int conhecimento;

    public Avaliacao(int cortesia, int eficiencia, int conhecimento) {
        this.cortesia = cortesia;
        this.eficiencia = eficiencia;
        this.conhecimento = conhecimento;
    }

    public double calcularMedia() {
        return (cortesia + eficiencia + conhecimento) / 3.0;
    }

    public String obterClassificacaoGeral() {
        double media = calcularMedia();
        if (media >= 4.5) {
            return "Excelente";
        } else if (media >= 3.5) {
            return "Bom";
        } else if (media >= 2.5) {
            return "Regular";
        } else {
            return "Ruim";
        }
    }

    public static int lerAvaliacao(Scanner scanner, String aspecto) {
        int avaliacao;
        do {
            System.out.print(aspecto + ": ");
            avaliacao = scanner.nextInt();
            if (avaliacao < 1 || avaliacao > 5) {
                System.out.println("Avaliação inválida. Por favor, insira um valor entre 1 e 5.");
            }
        } while (avaliacao < 1 || avaliacao > 5);
        return avaliacao;
    }
}