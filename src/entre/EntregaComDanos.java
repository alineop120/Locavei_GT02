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
public class EntregaComDanos extends Entrega {
    private String descricaoDanos;

    public EntregaComDanos(String codigo, int quilometragemFinal, LocalDate dataEntrega, String descricaoDanos) {
        super(codigo, quilometragemFinal, dataEntrega);
        this.descricaoDanos = descricaoDanos;
    }

    // Getters e Setters
    public String getDescricaoDanos() {
        return descricaoDanos;
    }

    public void setDescricaoDanos(String descricaoDanos) {
        this.descricaoDanos = descricaoDanos;
    }

    // Métodos adicionais ou sobrecargas específicos para EntregaComDanos
}
