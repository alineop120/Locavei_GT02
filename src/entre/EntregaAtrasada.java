package entre;

import java.time.LocalDate;
import java.util.Scanner;

public class EntregaAtrasada extends Entrega {
    // Atributos
    private double taxaAtraso;

    Scanner sc = new Scanner(System.in);

    // Construtor
    public EntregaAtrasada(String codigo, int quilometragemFinal, LocalDate dataEntrega, double taxaAtraso) {
        super(codigo, quilometragemFinal, dataEntrega);
        this.taxaAtraso = taxaAtraso;
        super.cadastra(); // Chamando o método cadastra() da classe mãe
    }

    // Métodos    
    @Override
    public double calcularCustoTotal() {
        double custoBase = calcularCustoBase(); // Obtém o custo base da entrega
        return custoBase + taxaAtraso; // Adiciona a taxa de atraso ao custo base
    }

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
