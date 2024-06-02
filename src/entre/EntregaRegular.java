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
public class EntregaRegular extends Entrega {
    // Construtor
    public EntregaRegular(String codigo, int quilometragemFinal, LocalDate dataEntrega) {
        super(codigo, quilometragemFinal, dataEntrega);
    }

    // Métodos adicionais ou sobrecargas específicos para EntregaRegular
}
