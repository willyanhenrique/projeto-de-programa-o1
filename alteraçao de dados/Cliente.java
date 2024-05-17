public class Cliente extends Pessoa {

    public Cliente(String nome, String email) {
        super(nome, email);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Cliente: " + getNome() + ", Email: " + getEmail());
    }
}
