import Entities.Numbers;
import Entities.Numbers2;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantos valores vai ter cada vetor? ");
    int n = sc.nextInt();
        Numbers[] vect1 = new Numbers[n];
        Numbers2[] vect2 = new Numbers2[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite o valore do vetor A: ");
            int  number1 = sc.nextInt();
            vect1[i] = new Numbers(number1);
        }
        for(int i = 0; i < n; i++){
            System.out.println("Digite o valore do vetor B: ");
            int number2 = sc.nextInt();
            vect2[i] = new Numbers2(number2);
        }

        for(int i = 0; i < n; i++){
            System.out.println(vect1[i].getNumber1() + vect2[i].getNumber2());
        }





    }
}