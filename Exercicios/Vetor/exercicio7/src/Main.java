import entities.Numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        Numbers[] vect = new Numbers[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            double num = sc.nextDouble();
            vect[i] = new Numbers(num);
            media += vect[i].getNumeros() / n;
        }
        System.out.println("\nMEDIA DO VETOR = " + media);
        System.out.println("ELEMENTOS ABAIXO DA media: ");
        for (int i = 0; i < n; i++){
            if(vect[i].getNumeros() < media){
                System.out.println(vect[i].getNumeros());
            }
        }
    }
}