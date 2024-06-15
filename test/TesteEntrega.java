import java.time.LocalDate;
import java.util.Scanner;
import entre.EntregaAtrasada;
import entre.EntregaComDanos;
import entre.EntregaRegular;

/**
 * ESCOLA TÉCNICA DE BRASÍLIA - ETB
 * CURSO TÉCNICO DE INFORMÁTICA
 * LINGUAGEM TÉCNICA DE PROGRAMAÇÃO 1
 * DATA: 15.06.2024
 * @authores Aline, Gabriel Moreira, João Gabriel, Verônica
 * DESENVOLVER DO PROJETO LOCAVEI
 */
public class TesteEntrega {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean loop = true;
            
            while (loop) {
                // Exibe o menu de opções
                System.out.println("\nMENU ->");
                System.out.println("1] Entrega Regular");
                System.out.println("2] Entrega Atrasada");
                System.out.println("3] Entrega com Danos");
                System.out.println("4] ENCERRAR");
                System.out.print("Opção: ");
                int op = sc.nextInt(); // Lê a opção escolhida pelo usuário
                
                switch (op) {
                    case 1:
                        // Opção para cadastro de entrega regular
                        System.out.println("Entre com os dados da Entrega Regular:");
                        EntregaRegular entregaRegular = new EntregaRegular("COD123", 100, LocalDate.now(), "Tipo A");
                        entregaRegular.cadastra(); // Chama o método de cadastro específico para entrega regular
                        System.out.println(entregaRegular.toString()); // Exibe os detalhes da entrega regular
                        System.out.println("Custo calculado: " + entregaRegular.calcularCustoTotal()); // Calcula e exibe o custo da entrega com danos
                        break;
                    case 2:
                        // Opção para cadastro de entrega atrasada
                        System.out.println("Entre com os dados da Entrega Atrasada:");
                        EntregaAtrasada entregaAtrasada = new EntregaAtrasada("COD456", 150, LocalDate.now(), 20.0);
                        entregaAtrasada.cadastra(); // Chama o método de cadastro específico para entrega atrasada
                        System.out.println(entregaAtrasada.toString()); // Exibe os detalhes da entrega atrasada
                        System.out.println("Custo calculado: " + entregaAtrasada.calcularCustoTotal()); // Calcula e exibe o custo da entrega com danos
                        break;
                    case 3:
                        // Opção para cadastro de entrega com danos
                        System.out.println("Entre com os dados da Entrega com Danos:");
                        EntregaComDanos entregaComDanos = new EntregaComDanos("COD789", 200, LocalDate.now());
                        entregaComDanos.cadastra(); // Chama o método de cadastro específico para entrega com danos
                        System.out.println(entregaComDanos.toString()); // Exibe os detalhes da entrega com danos
                        System.out.println("Custo calculado: " + entregaComDanos.calcularCustoTotal()); // Calcula e exibe o custo da entrega com danos
                        break;
                    case 4:
                        // Opção para encerrar o programa
                        System.out.println("-------------------------------------------------------");
                        System.out.println("\nPrograma encerrado!");
                        loop = false; // Altera a flag de loop para encerrar o while
                        break;
                    default:
                        // Opção inválida
                        System.out.println("\nOpção inválida! Por favor, escolha uma opção válida.");
                }
            }
        }
    }
}
