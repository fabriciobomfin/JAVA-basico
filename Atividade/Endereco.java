package Atividade;

public class Endereco {
    private String logradouro;
    private String numero;
    private String cidade;

    // Construtor vazio
    public Endereco() {
    }

    // Construtor com parâmetros
    public Endereco(String logradouro, String numero, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
    }

    // Getter e Setter para logradouro
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    // Getter e Setter para numero
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Getter e Setter para cidade
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Método toString para exibir o endereço
    @Override
    public String toString() {
        return "endereco [logradouro=" + logradouro + ", numero=" + numero + ", cidade=" + cidade + "]";
    }
}
