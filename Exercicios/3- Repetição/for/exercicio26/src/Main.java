import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor de N: ");
        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= n; i++) {




            System.out.print(i + " ");
            double quadrado = Math.pow(i, 2);
            double cubo = Math.pow(i, 3);
            System.out.print(String.format("%.0f", quadrado) + " ");
            System.out.print(String.format("%.0f", cubo));
            System.out.println();
        }


    }

}