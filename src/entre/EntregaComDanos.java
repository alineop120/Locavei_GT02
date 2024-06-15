package entre;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Classe que representa uma entrega com danos, subclasse de Entrega.
 */
public class EntregaComDanos extends Entrega {
    private double taxaAtraso; // Taxa de atraso da entrega
    
    Scanner sc = new Scanner(System.in); // Scanner para entrada de dados

    /**
     * Construtor da classe EntregaComDanos.
     * @param codigo Código da entrega
     * @param quilometragemFinal Quilometragem final da entrega
     * @param dataEntrega Data de entrega
     */
    public EntregaComDanos(String codigo, int quilometragemFinal, LocalDate dataEntrega) {
        super(codigo, quilometragemFinal, dataEntrega); // Chama o construtor da superclasse Entrega
    }

    /**
     * Método para definir a taxa de atraso da entrega com danos.
     * Solicita a taxa ao usuário e a atribui ao atributo taxaAtraso.
     */
    public void setTaxaAtraso() {
        System.out.print("Taxa de Atraso: ");
        this.taxaAtraso = sc.nextDouble();
    }

    /**
     * Implementação do método abstrato calcularCustoTotal() da classe Entrega.
     * Calcula o custo total da entrega com danos.
     * @return Custo total da entrega com danos
     */
    @Override
    public double calcularCustoTotal() {
        double custoBase = calcularCustoBase(); // Calcula o custo base da entrega
        double custoReparo = 100.0; // Exemplo de custo de reparo
        return custoBase + custoReparo + taxaAtraso; // Retorna o custo total somando o custo base, custo de reparo e taxa de atraso
    }

    /**
     * Sobrescrita do método cadastra() da classe Entrega para incluir a taxa de atraso.
     * Solicita os dados padrões da entrega e a taxa de atraso.
     */
    @Override
    public void cadastra() {
        super.cadastra(); // Chama o método cadastra da superclasse Entrega
        setTaxaAtraso(); // Chama o método para definir a taxa de atraso
    }

    /**
     * Sobrescrita do método toString para exibir detalhes da entrega com danos.
     * @return String com os detalhes da entrega com danos
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
