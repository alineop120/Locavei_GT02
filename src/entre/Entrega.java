package entre;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Classe abstrata que representa uma entrega genérica.
 */
public abstract class Entrega {
    private String codEntrega; // Código da entrega
    private int kmFim; // Quilometragem final da entrega
    private LocalDate dataEntrega; // Data de entrega
    
    Scanner scanner = new Scanner(System.in); // Scanner para entrada de dados

    /**
     * Construtor da classe Entrega.
     * @param codEntrega Código da entrega
     * @param kmFim Quilometragem final da entrega
     * @param dataEntrega Data de entrega
     */
    public Entrega(String codEntrega, int kmFim, LocalDate dataEntrega) {
        this.codEntrega = codEntrega;
        this.kmFim = kmFim;
        this.dataEntrega = dataEntrega;
    }
    
    /**
     * Método abstrato para calcular o custo total da entrega.
     * Deve ser implementado nas subclasses.
     * @return Custo total da entrega
     */
    public abstract double calcularCustoTotal();

    /**
     * Método para cadastrar os dados da entrega.
     * Solicita os dados ao usuário e os atribui aos atributos da classe.
     */
    public void cadastra() {       
        System.out.println("Digite o código da entrega: ");
        setCodEntrega(scanner.nextLine());
        
        System.out.println("Digite a quilometragem final da entrega: ");
        setKmFim(scanner.nextInt());
        
        System.out.println("Digite a data de entrega (no formato AAAA-MM-DD): ");
        String dataString = scanner.next();
        setDataEntrega(LocalDate.parse(dataString));
    }
    
    /**
     * Método para calcular o custo base da entrega.
     * Implementação padrão que pode ser sobrescrita nas subclasses.
     * @return Custo base da entrega
     */
    public double calcularCustoBase() {
        double custoPorQuilometro = 0.5; // Exemplo de custo por quilômetro
        return kmFim * custoPorQuilometro;
    }

    /**
     * Sobrescrita do método toString para exibir detalhes da entrega.
     * @return String com os detalhes da entrega
     */
    @Override
    public String toString() {
        return "Detalhes da entrega:\nCódigo: " + codEntrega + "\nQuilometragem Final: " + kmFim + "\nData de Entrega: " + dataEntrega;
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
