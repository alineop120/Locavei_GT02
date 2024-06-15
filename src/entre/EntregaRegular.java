package entre;

import java.time.LocalDate;

/**
 * Classe que representa uma entrega regular, subclasse de Entrega.
 */
public class EntregaRegular extends Entrega {
    private String tipo; // Tipo de entrega (exemplo)

    /**
     * Construtor da classe EntregaRegular.
     * @param codEntrega Código da entrega
     * @param kmFim Quilometragem final da entrega
     * @param dataEntrega Data de entrega
     * @param tipo Tipo de entrega
     */
    public EntregaRegular(String codEntrega, int kmFim, LocalDate dataEntrega, String tipo) {
        super(codEntrega, kmFim, dataEntrega); // Chama o construtor da superclasse Entrega
        this.tipo = tipo;
    }

    /**
     * Implementação do método abstrato calcularCustoTotal() da classe Entrega.
     * Calcula o custo total da entrega regular.
     * @return Custo total da entrega regular
     */
    @Override
    public double calcularCustoTotal() {
        // Exemplo simples: calcula o custo baseado apenas na quilometragem
        int km = getKmFim(); // Supondo que getKmFim() retorna os quilômetros da entrega
        double custoPorQuilometro = 0.5; // Exemplo de custo por quilômetro
        return km * custoPorQuilometro;
    }

    /**
     * Sobrescrita do método toString para exibir detalhes da entrega regular.
     * @return String com os detalhes da entrega regular
     */
    @Override
    public String toString() {
        return super.toString() + "\nTipo: " + tipo + "\nCusto Total: " + calcularCustoTotal();
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
