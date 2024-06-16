package logistica;

import java.util.ArrayList;
import java.util.List;
import entre.Entrega;

public class Transportadora {
    private String nome;
    private String cnpj;
    private String endereco;
    private List<Entrega> entregas;

    public Transportadora(String nome, String cnpj, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.entregas = new ArrayList<>();
    }

    public void adicionarEntrega(Entrega entrega) {
        entregas.add(entrega);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transportadora: ").append(nome).append("\n");
        sb.append("CNPJ: ").append(cnpj).append("\n");
        sb.append("Endereço: ").append(endereco).append("\n");
        return sb.toString();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Entrega> getEntregas() {
        return entregas;
    }

    public void setEntregas(List<Entrega> entregas) {
        this.entregas = entregas;
    }
}
