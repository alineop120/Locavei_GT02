import java.time.LocalDate;
import java.util.Scanner;
import entre.EntregaAtrasada;
import entre.EntregaComDanos;
import entre.EntregaRegular;
import cadastro.Cliente;
import cadastro.Endereco;
import logistica.Transportadora;

public class TesteEntrega {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean loop = true;
            // Criando uma instância de Transportadora com dados fictícios
            Transportadora transportadora = new Transportadora("Transporte Rápido", "12.345.678/0001-99", "Avenida Principal, 1000");
            // Criando uma instância de Cliente com dados fictícios
            Cliente cliente = new Cliente("João da Silva", "123.456.789-00", new Endereco("Rua Secundária", "Cidade", "Estado", "12345-678"));

            while (loop) {
                // Exibe o menu de opções
                System.out.println("\n----- MENU -----");
                System.out.println("1. Exibir Cliente");
                System.out.println("2. Exibir Transportadora");
                System.out.println("3. Entrega Regular");
                System.out.println("4. Entrega Atrasada");
                System.out.println("5. Entrega com Danos");
                System.out.println("6. ENCERRAR");
                System.out.print("Escolha uma opção: ");
                int op = sc.nextInt(); // Lê a opção escolhida pelo usuário

                switch (op) {
                    case 1:
                        // Opção para exibir os dados do cliente e suas entregas
                        System.out.println("\n--- Dados do Cliente ---");
                        System.out.println(cliente); // Exibe os dados do cliente
                        /*System.out.println("\n--- Entregas do Cliente ---");
                        cliente.getEntregas().forEach(System.out::println); // Exibe as entregas do cliente*/
                        break;
                    case 2:
                        // Opção para exibir os dados da transportadora e suas entregas
                        System.out.println("\n--- Dados da Transportadora ---");
                        System.out.println(transportadora); // Exibe os dados da transportadora
                        /*System.out.println("\n--- Entregas da Transportadora ---");
                        transportadora.getEntregas().forEach(System.out::println); // Exibe as entregas da transportadora*/
                        break;
                    case 3:
                        // Opção para cadastro de entrega regular
                        System.out.println("\n--- Cadastro de Entrega Regular ---");
                        EntregaRegular entregaRegular = new EntregaRegular("COD123", 100, LocalDate.now(), "Tipo A");
                        entregaRegular.cadastra(); // Chama o método de cadastro específico para entrega regular
                        transportadora.adicionarEntrega(entregaRegular); // Adiciona a entrega à transportadora
                        cliente.adicionarEntrega(entregaRegular); // Adiciona a entrega ao cliente
                        System.out.println("\n--- Detalhes da Entrega Regular ---");
                        System.out.println(entregaRegular); // Exibe os detalhes da entrega regular
                        System.out.println("Custo calculado: " + entregaRegular.calcularCustoTotal()); // Calcula e exibe o custo da entrega regular
                        break;
                    case 4:
                        // Opção para cadastro de entrega atrasada
                        System.out.println("\n--- Cadastro de Entrega Atrasada ---");
                        EntregaAtrasada entregaAtrasada = new EntregaAtrasada("COD456", 150, LocalDate.now(), 20.0);
                        entregaAtrasada.cadastra(); // Chama o método de cadastro específico para entrega atrasada
                        transportadora.adicionarEntrega(entregaAtrasada); // Adiciona a entrega à transportadora
                        cliente.adicionarEntrega(entregaAtrasada); // Adiciona a entrega ao cliente
                        System.out.println("\n--- Detalhes da Entrega Atrasada ---");
                        System.out.println(entregaAtrasada); // Exibe os detalhes da entrega atrasada
                        System.out.println("Custo calculado: " + entregaAtrasada.calcularCustoTotal()); // Calcula e exibe o custo da entrega atrasada
                        break;
                    case 5:
                        // Opção para cadastro de entrega com danos
                        System.out.println("\n--- Cadastro de Entrega com Danos ---");
                        EntregaComDanos entregaComDanos = new EntregaComDanos("COD789", 200, LocalDate.now());
                        entregaComDanos.cadastra(); // Chama o método de cadastro específico para entrega com danos
                        transportadora.adicionarEntrega(entregaComDanos); // Adiciona a entrega à transportadora
                        cliente.adicionarEntrega(entregaComDanos); // Adiciona a entrega ao cliente
                        System.out.println("\n--- Detalhes da Entrega com Danos ---");
                        System.out.println(entregaComDanos); // Exibe os detalhes da entrega com danos
                        System.out.println("Custo calculado: " + entregaComDanos.calcularCustoTotal()); // Calcula e exibe o custo da entrega com danos
                        break;
                    case 6:
                        // Opção para encerrar o programa
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
