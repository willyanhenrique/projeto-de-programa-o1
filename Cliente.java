import java.util.List;
import java.util.ArrayList;

public class Cliente extends Pessoa {

    private List <Consulta> consultasAgendadas;
    public Cliente(){

    }
    public Cliente(String nome, String cpf, String dataNascimento, String email, String senha, String telefone) {
        super(nome, cpf, dataNascimento, email, senha, telefone);
        this.consultasAgendadas = new ArrayList<>();
    }

    public void agendarConsulta(Consulta consulta) {
        consultasAgendadas.add(consulta);
    }

    public List<Consulta> getConsultasAgendadas() {
        return consultasAgendadas;
    }

    public void setConsultasAgendadas(List<Consulta> consultasAgendadas) {
        this.consultasAgendadas = consultasAgendadas;
    }
}
