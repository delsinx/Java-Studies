import java.util.Scanner;
import entities.Numbers;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        Numbers[] numbers = new Numbers[n];
        System.out.println(" ");

        for(int i = 0; i < n; i++){
        System.out.print("Digite um número: ");
        numbers[i] = new Numbers (sc.nextInt());
        System.out.println(" ");

        }
        for(int i = 0; i < n; i++){
            System.out.println("Valores: " + numbers[i].getNum());
        }

        System.out.println("Numeros Negativos : ");
        for(int i = 0; i < n; i++){
            if(numbers[i].getNum() < 0){
                System.out.print(numbers[i].getNum() + " \n");
            }
        }

    }
}