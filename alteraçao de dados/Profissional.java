public class Profissional extends Pessoa implements Trabalhador {
    private String areaAtuacao;

    public Profissional(String nome, String email, String areaAtuacao) {
        super(nome, email);
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    @Override
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Profissional: " + getNome() + ", Email: " + getEmail() + ", Área de Atuação: " + getAreaAtuacao());
    }
}

