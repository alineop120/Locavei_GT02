/*
 * Projeto Locavei - Teste
 */
package entre;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Aline
 */
public class TesteEntrega 
{

    /**
     * @param args the command line arguments
     * @param LocalDate
     */
    public static void main(String[] args, LocalDate LocalDate) 
    {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while (loop) 
        {
            System.out.println("\nMENU DA ENTREGA->");
            System.out.println("1] REGULAR");
            System.out.println("2] COM DANOS");
            System.out.println("3] ATRASADA");
            System.out.println("4] ENCERRAR");
            System.out.print("Opção: ");
            int op = sc.nextInt();
            switch (op) 
            {
                case 1:
                    EntregaRegular rg = new EntregaRegular("", 0, LocalDate);
                    break;
                case 2:
                    EntregaComDanos cd = new EntregaComDanos("", 0, LocalDate, "");
                    break;
                case 3:
                    EntregaAtrasada atr = new EntregaAtrasada("", 0, LocalDate, 0);
                    break;
                case 4:
                    System.out.println("\nPrograma encerrado!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção errada! Volte ao menu.");
            }
        }
    }
}
