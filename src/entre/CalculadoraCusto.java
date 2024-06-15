package entre;

/**
 * Classe que representa uma calculadora de custos para entregas.
 * Demonstração de polimorfismo estático através da sobrecarga de métodos.
 */
public class CalculadoraCusto {

    /**
     * Método para calcular o custo com base na quilometragem.
     * @param km Quilometragem da entrega
     * @return Custo calculado com base na quilometragem
     */
    public double calcularCusto(int km) {
        double custoPorQuilometro = 0.5;
        return km * custoPorQuilometro;
    }

    /**
     * Método para calcular o custo com base na quilometragem e na taxa de atraso.
     * @param km Quilometragem da entrega
     * @param taxaAtraso Taxa de atraso da entrega
     * @return Custo calculado com base na quilometragem e na taxa de atraso
     */
    public double calcularCusto(int km, double taxaAtraso) {
        double custoPorQuilometro = 0.5;
        return km * custoPorQuilometro + taxaAtraso;
    }

    /**
     * Método para calcular o custo com base na quilometragem, taxa de atraso e custo de reparo.
     * @param km Quilometragem da entrega
     * @param taxaAtraso Taxa de atraso da entrega
     * @param custoReparo Custo de reparo da entrega
     * @return Custo calculado com base na quilometragem, taxa de atraso e custo de reparo
     */
    public double calcularCusto(int km, double taxaAtraso, double custoReparo) {
        double custoPorQuilometro = 0.5;
        return km * custoPorQuilometro + taxaAtraso + custoReparo;
    }
}
