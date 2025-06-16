import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de N");
        int n = Integer.parseInt(sc.nextLine());
        double fatorial = 1;
        for(int i = 1; i <= n; i++) {

            fatorial *= i;
            // ou fatorial = (i) * fatorial;
            System.out.println(fatorial);

        }


    }
}