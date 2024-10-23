public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    @Override
    public void mostrarIdentificacao() {
        System.out.println("Pessoa Jurídica: " + nome + ", CNPJ: " + cnpj);

    }
}