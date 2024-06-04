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

    /*
    Exemplo:
    public String toString(){
        return(super.toStrng()+"\nCOMISSÃO PRODUTIVIDADE: "+getComisProd());
    }
    */
    
    // Implementação do método mostra
    @Override
    public String toString(){
        double custoTotal = calcularCustoTotal(); // Calcula o custo total
        return(super.toStrng()+"\nCusto Total: " + custoTotal);
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
