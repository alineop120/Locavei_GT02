package entre;

import java.time.LocalDate;

public class EntregaRegular extends Entrega {

    // Construtor
    public EntregaRegular(String codEntrega, int kmFim, LocalDate dataEntrega) {
        super(codEntrega, kmFim, dataEntrega);
        // O método `cadastra` deve ser chamado externamente para permitir flexibilidade
    }

    // Implementação do método abstrato para calcular o custo total
    @Override
    public double calcularCustoTotal() {
        // Exemplo simples onde o custo total é igual ao custo base para entregas regulares
        return calcularCustoBase();
    }

    // Método para mostrar informações da entrega
    @Override
    public void mostra() {
        super.mostra(); // Chama o método mostra() da superclasse
        double custoBase = calcularCustoBase(); // Calcula o custo base
        System.out.println("Custo Base: " + custoBase);
        double custoTotal = calcularCustoTotal(); // Calcula o custo total
        System.out.println("Custo Total: " + custoTotal);
    }
}