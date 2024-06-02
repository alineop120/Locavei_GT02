/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entre;

// Importar
import java.util.Scanner;
import java.time.LocalDate;

public class Entrega {
    // Atributos
    private String codEntrega;
    private int kmFim;
    private LocalDate dataEntrega;

    // Construtor
    public Entrega(String codEntrega, int kmFim, LocalDate dataEntrega) {
        this.codEntrega = codEntrega;
        this.kmFim = kmFim;
        this.dataEntrega = dataEntrega;
    }
    
    // Métodos
    public void cadastra(){
        
    }
    
    public void mostra(){
        
    }

    // Getters e Setters
    public String getCodEntrega() {
        return codEntrega;
    }

    public void setCodEntrega(String codEntrega) {
        this.codEntrega = codEntrega;
    }

    public int getKmFim() {
        return kmFim;
    }

    public void setKmFim(int kmFim) {
        this.kmFim = kmFim;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

}