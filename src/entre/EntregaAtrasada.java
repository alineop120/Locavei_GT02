package entre;

import java.time.LocalDate;

/**
 * Classe que representa uma entrega atrasada, subclasse de Entrega.
 */
public class EntregaAtrasada extends Entrega {
    private double taxaAtraso; // Taxa de atraso da entrega

    /**
     * Construtor da classe EntregaAtrasada.
     * @param codigo Código da entrega
     * @param quilometragemFinal Quilometragem final da entrega
     * @param dataEntrega Data de entrega
     * @param taxaAtraso Taxa de atraso da entrega
     */
    public EntregaAtrasada(String codigo, int quilometragemFinal, LocalDate dataEntrega, double taxaAtraso) {
        super(codigo, quilometragemFinal, dataEntrega); // Chama o construtor da superclasse Entrega
        this.taxaAtraso = taxaAtraso;
    }

    /**
     * Implementação do método abstrato calcularCustoTotal() da classe Entrega.
     * Calcula o custo total da entrega atrasada.
     * @return Custo total da entrega atrasada
     */
    @Override
    public double calcularCustoTotal() {
        double custoBase = calcularCustoBase(); // Calcula o custo base da entrega
        return custoBase + taxaAtraso; // Adiciona a taxa de atraso ao custo base
    }

    /**
     * Sobrescrita do método toString para exibir detalhes da entrega atrasada.
     * @return String com os detalhes da entrega atrasada
     */
    @Override
    public String toString() {
        return super.toString() + "\nTaxa de Atraso: " + taxaAtraso + "\nCusto Total: " + calcularCustoTotal();
    }

    // Getters e Setters
    public double getTaxaAtraso() {
        return taxaAtraso;
    }

    public void setTaxaAtraso(double taxaAtraso) {
        this.taxaAtraso = taxaAtraso;
    }
}
