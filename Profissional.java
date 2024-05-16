import java.sql.PreparedStatement;

class Profissional extends Pessoa {
    private String especialidade;

    private String registroProfissional;
    public Profissional(){

    }

    public Profissional(String especialidade, String registroProfissional, String nome, String cpf, String dataNascimento, String email, String senha, String telefone) {
        super(nome, cpf, dataNascimento, email, senha,telefone);
        this.especialidade = especialidade;
        this.registroProfissional = registroProfissional;
    }

    // Getter e setter específico para especialidade
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
}

