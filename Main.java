import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero 5: ");
        int n = teclado.nextInt();
        if(n >= 0 && n<=6) {
            for(int i = 0; i < n; i++) {
                System.out.print("—");
            }
            System.out.println();
            for(int i = 0; i < n-2; i++) {
                System.out.print("|");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
            for(int i = 0; i < n; i++) {
                System.out.print("—");
            }
        }
        }

    }
