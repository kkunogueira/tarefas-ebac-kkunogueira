public class Main {
    public static void main(String[] args) {
        Pessoa pessoaFisica = new PessoaFisica("João Silva", "123.456.789-10");
        pessoaFisica.mostrarIdentificacao();

        Pessoa pessoaJuridica = new PessoaJuridica("Empresa X", "12.345.678/0001-99");
        pessoaJuridica.mostrarIdentificacao();
    }
}
