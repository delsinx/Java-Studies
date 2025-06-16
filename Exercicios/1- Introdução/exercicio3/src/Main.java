import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

           System.out.println("Insira os valores de A, B, C e D: ");

           int a = sc.nextInt();
           sc.nextLine();
           int b = Integer.parseInt(sc.nextLine()) ;
           int c = Integer.parseInt(sc.nextLine());
           int d = Integer.parseInt(sc.nextLine());

           int diferenca = (a * b ) - (c * d);

           System.out.println("A diferença entra as multiplicações é: " + diferenca);



    }
}