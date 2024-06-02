package entre;

import java.util.Scanner;

/**
 * ESCOLA TÉCNICA DE BRASÍLIA - ETB
 * CURSO TÉCNICO DE INFORMÁTICA
 * LINGUAGEM TÉCNICA DE PROGRAMAÇÃO 1
 * DATA:02.06.2024
 * @authores Aline, Gabriel Moreira, João Gabriel, Verônica
 * DESENVOLVER DO PROJETO LOCAVEI
 */
public class TesteEntrega 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
        boolean loop = true;
            
        while (loop) 
        {
            System.out.println("\nMENU ->");
            System.out.println("1]Entrega Regular");
            System.out.println("2]Entrega Atrasada");
            System.out.println("3]Entrega com Danos");
            System.out.println("4]ENCERRAR");
            System.out.print("Opção: ");
            int op = sc.nextInt();
                
            switch (op) 
            {
                case 1:
                    System.out.println("Entre com os dados da Entrega Regular:");
                    EntregaRegular rg = new EntregaRegular("", 0, null);
                    rg.cadastra();
                    System.out.println("-------------------------------------------------------");
                    rg.mostra();
                    break;
                case 2:
                    System.out.println("Entre com os dados da Entrega Atrasada:");
                    EntregaAtrasada atr = new EntregaAtrasada("", 0, null, 0);
                    atr.cadastra();
                    System.out.println("-------------------------------------------------------");
                    atr.mostra();
                    break;
                 case 3:
                    System.out.println("Entre com os dados da Entrega com Danos:");
                    EntregaComDanos entregaComDanos = new EntregaComDanos("", 0, null);
                    entregaComDanos.cadastra();
                    System.out.println("-------------------------------------------------------");
                    entregaComDanos.mostra();
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