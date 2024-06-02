package entre;

import java.time.LocalDate;
import java.util.Scanner;

public class EntregaComDanos extends Entrega {
    // Atributos
    private double taxaAtraso;

    // Scanner para entrada de dados
    private static final Scanner sc = new Scanner(System.in);

    // Construtor
    public EntregaComDanos(String codigo, int quilometragemFinal, LocalDate dataEntrega) {
        super(codigo, quilometragemFinal, dataEntrega);
    }

    // Método para definir a taxa de atraso
    public void setTaxaAtraso() {
        System.out.print("Taxa de Atraso: ");
        this.taxaAtraso = sc.nextDouble();
    }

    @Override
    public double calcularCustoTotal() {
        double custoBase = calcularCustoBase(); // Obtém o custo base da entrega
        double custoReparo = 100.0; // Exemplo de custo fixo de reparo
        return custoBase + custoReparo + taxaAtraso; // Adiciona a taxa de atraso ao custo total
    }

    @Override
    public void mostra() {
        super.mostra(); // Chama o método mostra() da superclasse
        double custoTotal = calcularCustoTotal(); // Calcula o custo total
        System.out.println("Taxa de Atraso: " + taxaAtraso);
        System.out.println("Custo Total: " + custoTotal);
    }

    // Getters e Setters
    public double getTaxaAtraso() {
        return taxaAtraso;
    }

    public void setTaxaAtraso(double taxaAtraso) {
        this.taxaAtraso = taxaAtraso;
    }
}