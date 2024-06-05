package entre;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * ESCOLA TÉCNICA DE BRASÍLIA - ETB
 * CURSO TÉCNICO DE INFORMÁTICA
 * LINGUAGEM TÉCNICA DE PROGRAMAÇÃO 1
 * DATA: 04.06.2024
 * @authores Aline, Gabriel Moreira, João Gabriel, Verônica
 * DESENVOLVER DO PROJETO LOCAVEI
 */
public class TesteEntrega {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("\nMENU ->");
            System.out.println("1] Entrega Regular");
            System.out.println("2] Entrega Atrasada");
            System.out.println("3] Entrega com Danos");
            System.out.println("4] ENCERRAR");
            System.out.print("Opção: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Entre com os dados da Entrega Regular:");
                    EntregaRegular entregaRegular = new EntregaRegular("COD123", 100, LocalDate.now(), "Tipo A");
                    entregaRegular.cadastra();
                    System.out.println(entregaRegular.toString());
                    break;
                case 2:
                    System.out.println("Entre com os dados da Entrega Atrasada:");
                    EntregaAtrasada entregaAtrasada = new EntregaAtrasada("COD456", 150, LocalDate.now(), 20.0);
                    entregaAtrasada.cadastra();
                    System.out.println(entregaAtrasada.toString());
                    break;
                case 3:
                    System.out.println("Entre com os dados da Entrega com Danos:");
                    EntregaComDanos entregaComDanos = new EntregaComDanos("COD789", 200, LocalDate.now());
                    entregaComDanos.cadastra();
                    System.out.println(entregaComDanos.toString());
                    break;
                case 4:
                    System.out.println("-------------------------------------------------------");
                    System.out.println("\nPrograma encerrado!");
                    loop = false;
                    break;
                default:
                    System.out.println("\nOpção inválida! Por favor, escolha uma opção válida.");
            }
        }
        sc.close();
    }
}
