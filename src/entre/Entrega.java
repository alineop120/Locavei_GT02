package entre;

// Importar
import java.time.LocalDate;
import java.util.Scanner;

public abstract class Entrega {
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
    public void cadastra() {       
        // Solicitar entrada de dados do usuário
        System.out.println("Digite o código da entrega: ");
        setCodEntrega(getScanner().nextLine());
        System.out.println("Digite a quilometragem final da entrega: ");
        setKmFim(getScanner().nextInt());
        getScanner().nextLine(); // Consome o newline
        
        System.out.println("Digite a data de entrega (no formato AAAA-MM-DD): ");
        String dataString = getScanner().next();
        setDataEntrega(LocalDate.parse(dataString));
    }
    
    // Método para calcular o custo base da entrega
    public double calcularCustoBase() {
        double custoPorQuilometro = 0.5; // Exemplo de custo por quilômetro
        return kmFim * custoPorQuilometro;
    }

    /* Método abstrato para calcular o custo total da entrega */
    public abstract double calcularCustoTotal(); 
    
    @Override
    public String toString(){
        return("Detalhes da entrega:"
                +"\nCódigo: " + getCodEntrega()
                +"\nQuilometragem Final: " + getKmFim()
                +"\nData de Entrega: " + getDataEntrega());
    }
    
    /* Getters e Setters */

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

    String toStrng() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}