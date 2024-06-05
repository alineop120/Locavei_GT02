package entre;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class Entrega {
    private String codEntrega;
    private int kmFim;
    private LocalDate dataEntrega;
    private Scanner scanner = new Scanner(System.in);

    public Entrega(String codEntrega, int kmFim, LocalDate dataEntrega) {
        this.codEntrega = codEntrega;
        this.kmFim = kmFim;
        this.dataEntrega = dataEntrega;
    }
    
    public void cadastra() {       
        System.out.println("Digite o código da entrega: ");
        setCodEntrega(scanner.nextLine());
        
        System.out.println("Digite a quilometragem final da entrega: ");
        setKmFim(scanner.nextInt());
        
        System.out.println("Digite a data de entrega (no formato AAAA-MM-DD): ");
        String dataString = scanner.next();
        setDataEntrega(LocalDate.parse(dataString));
    }
    
    public double calcularCustoBase() {
        double custoPorQuilometro = 0.5; // Exemplo de custo por quilômetro
        return kmFim * custoPorQuilometro;
    }

    public abstract double calcularCustoTotal();

    @Override
    public String toString() {
        return "Detalhes da entrega:\nCódigo: " + codEntrega + "\nQuilometragem Final: " + kmFim + "\nData de Entrega: " + dataEntrega;
    }

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