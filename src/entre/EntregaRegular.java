package entre;

import java.time.LocalDate;

public class EntregaRegular extends Entrega {
    // Atributos
    private int kmFim;
    private String tipo;

    // Construtor
    public EntregaRegular(String codEntrega, int kmFim, LocalDate dataEntrega, String tipo) {
        super(codEntrega, kmFim, dataEntrega);
        this.kmFim = kmFim;
        this.tipo = tipo;
        super.cadastra();
    }

    // Método para calcular o custo base
    @Override
    public double calcularCustoBase() {
        // Supondo que o custo seja calculado com base na quilometragem final da entrega
        double custoPorQuilometro = 0.5; // Exemplo de custo por quilômetro
        return getKmFim() * custoPorQuilometro;
    }

    // Método para mostrar informações da entrega
    @Override
    public void mostra() {
        super.mostra(); // Chama o método mostra() da superclasse
        double custoBase = calcularCustoBase(); // Calcula o custo base
        System.out.println("Custo Base: " + custoBase);
    }

    // Getters e Setters

    /**
     * @return the kmFim
     */
    @Override
    public int getKmFim() {
        return kmFim;
    }

    /**
     * @param kmFim the kmFim to set
     */
    @Override
    public void setKmFim(int kmFim) {
        this.kmFim = kmFim;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    } 
}