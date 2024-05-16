class Consulta {
    private String data;
    private String horario;
    private Cliente cliente;
    private Profissional profissional;

    public Consulta(String data, String horario, Cliente cliente, Profissional profissional) {
        this.data = data;
        this.horario = horario;
        this.cliente = cliente;
        this.profissional = profissional;
    }

    // Getters e setters
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }
}