package entre;

// Importar
import java.time.LocalDate;
import java.util.Scanner;

public class Entrega {
    // Atributos
    private String codEntrega;
    private int kmFim;
    private LocalDate dataEntrega;
    private Scanner scanner = new Scanner(System.in);

    // Construtor
    public Entrega(String codEntrega, int kmFim, LocalDate dataEntrega) {
        this.codEntrega = codEntrega;
        this.kmFim = kmFim;
        this.dataEntrega = dataEntrega;
    }
    
    // Métodos

    /**
     *
     */
    public void cadastra() {       
        // Solicitar entrada de dados do usuário
        System.out.println("Digite o código da entrega: ");
        setCodEntrega(getScanner().nextLine());
        
        System.out.println("Digite a quilometragem final da entrega: ");
        setKmFim(getScanner().nextInt());
        
        System.out.println("Digite a data de entrega (no formato AAAA-MM-DD): ");
        String dataString = getScanner().next();
        setDataEntrega(LocalDate.parse(dataString));
    }
    
    // Método para calcular o custo base da entrega
    public double calcularCustoBase() {
        double custoPorQuilometro = 0.5; // Exemplo de custo por quilômetro
        return kmFim * custoPorQuilometro;
    }

    // Método abstrato para calcular o custo total da entrega
    public double calcularCustoTotal() {
        return calcularCustoBase(); // Como padrão, apenas o custo base é retornado
    } 
    
    public void mostra() {
        System.out.println("Detalhes da entrega:");
        System.out.println("Código: " + getCodEntrega());
        System.out.println("Quilometragem Final: " + getKmFim());
        System.out.println("Data de Entrega: " + getDataEntrega());
    }

    // Getters e Setters

    /**
     * @return the codEntrega
     */
    public String getCodEntrega() {
        return codEntrega;
    }

    /**
     * @param codEntrega the codEntrega to set
     */
    public void setCodEntrega(String codEntrega) {
        this.codEntrega = codEntrega;
    }

    /**
     * @return the kmFim
     */
    public int getKmFim() {
        return kmFim;
    }

    /**
     * @param kmFim the kmFim to set
     */
    public void setKmFim(int kmFim) {
        this.kmFim = kmFim;
    }

    /**
     * @return the dataEntrega
     */
    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    /**
     * @param dataEntrega the dataEntrega to set
     */
    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    /**
     * @return the scanner
     */
    public Scanner getScanner() {
        return scanner;
    }

    /**
     * @param scanner the scanner to set
     */
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    
}