import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CadastroPessoas {
    private List<Cliente> clientes;
    private List<Profissional> profissionais;

    public CadastroPessoas() {
        clientes = new ArrayList<>();
        profissionais = new ArrayList<>();
    }

    public void cadastrarCliente(String nomeCliente, String cpf, String dataNascimento, String senha, String telefone, List<String> consultasAgendadas) {
        Cliente cliente = new Cliente(Collections.singletonList(nomeCliente), cpf, dataNascimento, senha, telefone, consultasAgendadas);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void cadastrarProfissional(String nomeProfissional, String cpf, String dataNascimento, String senha, String telefone,
                                      String especialidade, String registroProfissional, List<String> datasDisponiveis) {
        Profissional profissional = new Profissional(String.valueOf(Collections.singletonList(nomeProfissional)), cpf, dataNascimento, senha, telefone, especialidade,
                registroProfissional, datasDisponiveis);
        profissionais.add(profissional);
        System.out.println("Profissional cadastrado com sucesso!");
    }

    public List<Profissional> buscarProfissionaisPorEspecialidade(String especialidade) {
        List<Profissional> profissionaisEncontrados = new ArrayList<>();
        for (Profissional profissional : profissionais) {
            if (profissional.getEspecialidade().equalsIgnoreCase(especialidade)) {
                profissionaisEncontrados.add(profissional);
            }
        }
        return profissionaisEncontrados;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Profissional> getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(List<Profissional> profissionais) {
        this.profissionais = profissionais;
    }
}
