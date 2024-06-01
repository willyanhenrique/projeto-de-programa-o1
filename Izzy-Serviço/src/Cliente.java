import java.util.List;

public class Cliente extends Pessoa {
    private List<String> nomeCliente;
    private List<String> consultasAgendadas;

    public Cliente(List<String> nomeCliente, String cpf, String dataNascimento, String senha, String telefone, List<String> consultasAgendadas) {
        super(cpf, dataNascimento, senha, telefone);
        this.nomeCliente = nomeCliente;
        this.consultasAgendadas = consultasAgendadas;
    }

    public List<String> getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String novoNomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public List<String> getConsultasAgendadas() {
        return consultasAgendadas;
    }

    public void setConsultasAgendadas(List<String> consultasAgendadas) {
        this.consultasAgendadas = consultasAgendadas;
    }

    // Método para adicionar consulta agendada
    public void adicionarConsultaAgendada(String consulta) {
        consultasAgendadas.add(consulta);
    }
}
