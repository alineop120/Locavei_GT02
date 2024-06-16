// Arquivo: Endereco.java
// Pacote: cadastro

package cadastro;

/**
 * Classe que representa um endereço.
 */
public class Endereco {
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

    /**
     * Construtor da classe Endereco.
     * @param rua Rua do endereço
     * @param cidade Cidade do endereço
     * @param estado Estado do endereço
     * @param cep CEP do endereço
     */
    public Endereco(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }

    // Getters e Setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
