package cadastro;

import java.util.ArrayList;
import java.util.List;
import entre.Entrega;

/**
 * Classe que representa um cliente.
 */
public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private List<Entrega> entregas;

    /**
     * Construtor da classe Cliente.
     * @param nome Nome do cliente
     * @param cpf CPF do cliente
     * @param endereco Endereço do cliente
     */
    public Cliente(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.entregas = new ArrayList<>();
    }

    /**
     * Método para adicionar uma entrega ao cliente.
     * @param entrega Entrega a ser adicionada
     */
    public void adicionarEntrega(Entrega entrega) {
        entregas.add(entrega);
    }

    /**
     * Método para exibir as informações do cliente e suas entregas.
     * @return String com as informações do cliente e suas entregas
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("CPF: ").append(cpf).append("\n");
        sb.append("Endereço: ").append(endereco.toString()).append("\n");
        sb.append("Entregas: \n");
        entregas.forEach((entrega) -> {
            sb.append(entrega.toString()).append("\n");
        });
        return sb.toString();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Entrega> getEntregas() {
        return entregas;
    }

    public void setEntregas(List<Entrega> entregas) {
        this.entregas = entregas;
    }
}
