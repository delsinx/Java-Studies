import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Insira o valor do raio: ");
            double raio = sc.nextDouble();
            double pi = 3.14159;
            double area = pi * (Math.pow(raio, 2));

            System.out.println("O valor da área é de " + String.format("%.4f%n", area));



    }
}