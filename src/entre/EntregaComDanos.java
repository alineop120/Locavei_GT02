package entre;

import java.time.LocalDate;
import java.util.Scanner;

public class EntregaComDanos extends Entrega {
    // Atributos
    private double taxaAtraso;

    // Scanner para entrada de dados
    private final Scanner sc;

    // Construtor
    public EntregaComDanos(String codigo, int quilometragemFinal, LocalDate dataEntrega) {
        super(codigo, quilometragemFinal, dataEntrega);
        this.sc = new Scanner(System.in);
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
    public void cadastra() {
        super.cadastra(); // Chama o método cadastra() da superclasse
        setTaxaAtraso(); // Define a taxa de atraso
    }

    @Override
    public String toString(){
        double custoTotal = calcularCustoTotal(); // Calcula o custo total
        return(super.toStrng()+"\nTaxa de Atraso: " + taxaAtraso
                +"Custo Total: " + custoTotal);
    }

    // Getters e Setters
    public double getTaxaAtraso() {
        return taxaAtraso;
    }

    public void setTaxaAtraso(double taxaAtraso) {
        this.taxaAtraso = taxaAtraso;
    }
}
