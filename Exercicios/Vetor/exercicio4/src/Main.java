import java.util.Scanner;
import Numeros.Numbers;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números voce vai digitar? ");
        int quantidade = sc.nextInt();

        Numbers[] num = new Numbers[quantidade];

         for(int i = 0; i < quantidade; i++){
            System.out.print("Digite um número: ");
            int valor = sc.nextInt();
            num[i] = new Numbers(valor);
        }
        System.out.print("NÚMEROS PARES: \n");
         int cont =0;
        for(int i = 0; i < quantidade; i++){
            if(num[i].getNum() % 2 ==0) {
                System.out.print( num[i].getNum() + " " );
                cont += 1;
            }
        }
        System.out.println("\nQUANTIDADE DE PARES = " + cont);
        sc.close();
    }
}