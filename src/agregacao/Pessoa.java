package agregacao;

public class Pessoa {
    private String nome;
    private String endereco;
    private CodigoPostal cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
      this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setCpf(CodigoPostal cpf) {
      this.cpf = cpf;
    }

    public CodigoPostal getCpf() {
        return this.cpf;
    }
}
