import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opc = 1; // entrada do laço de repetição
        while (opc != 0) {
            System.out.println("MENU");
            System.out.println("ESCOLHA A OPÇÃO QUE DESEJA EXECUTAR");
            System.out.println("1- OLÁ MUNDO");
            System.out.println("2- IMPRIME NOME");
            System.out.println("3- IMPRIME IMPAR E PAR");
            System.out.println("4- RESTRIÇÃO AOS MÚLTIPLOS DE 4");
            System.out.println("5- SEQUÊNCIA DE FIBONACCI");
            Scanner scanner = new Scanner(System.in);
            String valorTela = scanner.nextLine();
            opc = Integer.parseInt(valorTela);
            if (opc == 1) {
                System.out.println("Olá Mundo");
            } 
            else if (opc == 2) {
                int i = 1;
                while (i <= 100) {
                    System.out.println(i + " Cristiano Marques Silva");
                    i++;
                }
            } 
            else if (opc == 3) {
                for (int i = 1; i <= 100; i++) {
                    int resto = i % 2;
                    if (resto == 1) {
                        System.out.println("*");
                    } else {
                        System.out.println("**");
                    }
                }
            } 
            else if (opc == 4) {
                for (int i = 1; i <= 100; i++) {
                    int multiplo = i % 4;
                    if (multiplo == 0) {
                        System.out.println("PI");
                    } else {
                        System.out.println(i);
                    }
                }
            } 
            else if (opc == 5) {
                int vezesQueRepete = 30;
                int t1 = 0;
                int t2 = 1;
                for (int i = 1; i <= vezesQueRepete; i++) {
                    System.out.print(t1 + " ");
                    int sum = t1 + t2;
                    t1 = t2;
                    t2 = sum;
                }
            }
        }
    }
}
