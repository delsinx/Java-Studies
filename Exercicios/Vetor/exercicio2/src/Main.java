import java.util.Scanner;
import numbers.Numbers;


public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double calculo = 0;
    System.out.println("Quantos números irá digitar? ");
    int n = sc.nextInt();

    Numbers[] numbers = new Numbers[n];

    for(int i = 0; i < n; i++){
        System.out.println("Insira um número");
        numbers[i] = new Numbers(sc.nextInt());

        calculo +=  numbers[i].getNumero();
    }
    System.out.print("Valores = ");
    for(int i =0; i<n; i++){
        System.out.printf(String.format("%.2f", numbers[i].getNumero()) + " ");

    }
    System.out.println();
    System.out.printf("A soma é = %.2f",calculo);
    System.out.println();
    System.out.print("Média = " + String.format("%.2f", calculo / n));



    }
}