package entre;

import java.time.LocalDate;

public class EntregaAtrasada extends Entrega {
    // Atributos
    private double taxaAtraso;

    // Construtor
    public EntregaAtrasada(String codigo, int quilometragemFinal, LocalDate dataEntrega, double taxaAtraso) {
        super(codigo, quilometragemFinal, dataEntrega);
        this.taxaAtraso = taxaAtraso;
    }

    // Implementação do método abstrato para calcular o custo total
    @Override
    public double calcularCustoTotal() {
        // Calcula o custo total somando o custo base com a taxa de atraso
        return calcularCustoBase() + taxaAtraso;
    }

    // Implementação do método mostra
    @Override
    public void mostra() {
        super.mostra(); // Chama o método mostra() da superclasse
        double custoTotal = calcularCustoTotal(); // Calcula o custo total
        System.out.println("Custo Total: " + custoTotal);
    }

    // Getters e Setters
    /**
     * @return the taxaAtraso
     */
    public double getTaxaAtraso() {
        return taxaAtraso;
    }

    /**
     * @param taxaAtraso the taxaAtraso to set
     */
    public void setTaxaAtraso(double taxaAtraso) {
        this.taxaAtraso = taxaAtraso;
    }
}
