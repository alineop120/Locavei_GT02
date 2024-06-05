package entre;

import java.time.LocalDate;
import java.util.Scanner;

public class EntregaComDanos extends Entrega {
    private double taxaAtraso;
    private final Scanner sc;

    public EntregaComDanos(String codigo, int quilometragemFinal, LocalDate dataEntrega) {
        super(codigo, quilometragemFinal, dataEntrega);
        this.sc = new Scanner(System.in);
    }

    public void setTaxaAtraso() {
        System.out.print("Taxa de Atraso: ");
        this.taxaAtraso = sc.nextDouble();
    }

    @Override
    public double calcularCustoTotal() {
        double custoBase = calcularCustoBase();
        double custoReparo = 100.0;
        return custoBase + custoReparo + taxaAtraso;
    }

    @Override
    public void cadastra() {
        super.cadastra();
        setTaxaAtraso();
    }

    @Override
    public String toString() {
        return super.toString() + "\nTaxa de Atraso: " + taxaAtraso + "\nCusto Total: " + calcularCustoTotal();
    }

    public double getTaxaAtraso() {
        return taxaAtraso;
    }

    public void setTaxaAtraso(double taxaAtraso) {
        this.taxaAtraso = taxaAtraso;
    }

    public Scanner getSc() {
        return sc;
    }
}
