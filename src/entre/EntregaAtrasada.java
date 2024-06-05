package entre;

import java.time.LocalDate;

public class EntregaAtrasada extends Entrega {
    private double taxaAtraso;

    public EntregaAtrasada(String codigo, int quilometragemFinal, LocalDate dataEntrega, double taxaAtraso) {
        super(codigo, quilometragemFinal, dataEntrega);
        this.taxaAtraso = taxaAtraso;
    }

    @Override
    public double calcularCustoTotal() {
        return calcularCustoBase() + taxaAtraso;
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
}