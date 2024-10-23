public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    @Override
    public void mostrarIdentificacao() {
        System.out.println("Pessoa Física: " + nome + ", CPF: " + cpf);

    }
}