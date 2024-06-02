/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entre;

import java.time.LocalDate;

/**
 *
 * @author Aline
 */
public class EntregaAtrasada extends Entrega {
    private double taxaAtraso;

    public EntregaAtrasada(String codigo, int quilometragemFinal, LocalDate dataEntrega, double taxaAtraso) {
        super(codigo, quilometragemFinal, dataEntrega);
        this.taxaAtraso = taxaAtraso;
    }

    // Getters e Setters
    public double getTaxaAtraso() {
        return taxaAtraso;
    }

    public void setTaxaAtraso(double taxaAtraso) {
        this.taxaAtraso = taxaAtraso;
    }

    // Métodos adicionais ou sobrecargas específicos para EntregaAtrasada
}
