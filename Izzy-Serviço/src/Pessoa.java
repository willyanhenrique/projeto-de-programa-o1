public class Pessoa {
    protected String cpf;
    protected String dataNascimento;
    protected String senha;
    protected String telefone;

    public Pessoa(String cpf, String dataNascimento, String senha, String telefone) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean validarLogin(String cpf, String senha) {
        return this.cpf.equals(cpf) && this.senha.equals(senha);
    }
}
