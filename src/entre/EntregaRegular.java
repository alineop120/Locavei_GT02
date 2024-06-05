package entre;

import java.time.LocalDate;

public class EntregaRegular extends Entrega {
    private String tipo;

    public EntregaRegular(String codEntrega, int kmFim, LocalDate dataEntrega, String tipo) {
        super(codEntrega, kmFim, dataEntrega);
        this.tipo = tipo;
    }

    @Override
    public double calcularCustoTotal() {
        return calcularCustoBase();
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: " + tipo + "\nCusto Total: " + calcularCustoTotal();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
