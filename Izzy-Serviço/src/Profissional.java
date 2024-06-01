import java.util.ArrayList;
import java.util.List;

class Profissional extends Pessoa {
    private String nomeProfissional;
    private String especialidade;
    private String registroProfissional;
    private List<String> datasDisponiveis;
    private List<String> consultasAgendadas; // Adicionado para armazenar as consultas agendadas
    private List<Integer> avaliacoes; // Adicionado para armazenar as avaliações

    public Profissional(String nomeProfissional, String cpf, String dataNascimento, String senha, String telefone,
                        String especialidade, String registroProfissional, List<String> datasDisponiveis) {
        super(cpf, dataNascimento, senha, telefone);
        this.nomeProfissional = nomeProfissional;
        this.especialidade = especialidade;
        this.registroProfissional = registroProfissional;
        this.datasDisponiveis = datasDisponiveis;
        this.consultasAgendadas = new ArrayList<>(); // Inicializa a lista de consultas agendadas
        this.avaliacoes = new ArrayList<>(); // Inicializa a lista de avaliações
    }

    public String getNomeProfissional() {
        return nomeProfissional;
    }

    public void setNomeProfissional(String nomeProfissional) {
        this.nomeProfissional = nomeProfissional;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public List<String> getDatasDisponiveis() {
        return datasDisponiveis;
    }

    public void setDatasDisponiveis(List<String> datasDisponiveis) {
        this.datasDisponiveis = datasDisponiveis;
    }

    public boolean verificarDisponibilidade(String dataConsulta) {
        return datasDisponiveis.contains(dataConsulta);
    }

    public List<String> getConsultasAgendadas() {
        return consultasAgendadas;
    }

    public void adicionarConsultaAgendada(String consulta) {
        consultasAgendadas.add(consulta);
    }

    public void removerConsultaAgendada(String consulta) {
        consultasAgendadas.remove(consulta);
    }

    public void adicionarAvaliacao(int nota) {
        avaliacoes.add(nota);
    }

    public double calcularMediaAvaliacao() {
        if (avaliacoes.isEmpty()) {
            return 0.0;
        }
        int soma = 0;
        for (int nota : avaliacoes) {
            soma += nota;
        }
        return (double) soma / avaliacoes.size();
    }
}
