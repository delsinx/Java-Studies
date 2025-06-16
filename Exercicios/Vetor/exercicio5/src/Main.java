import java.util.Scanner;
import entities.Numbers;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double maior = 0;
        int posicao = 0;

        System.out.println("Quantos números voce deseja digitar?");
        int n = sc.nextInt();
        Numbers[] vect = new Numbers[n];

        for(int i = 0; i < n; i++) {
           System.out.print("Digite um número: ");
           double num = sc.nextDouble();
            vect[i] = new Numbers(num);
        }
        for(int i = 0; i < n; i++) {
            if(vect[i].getNum() > maior) {
                maior = vect[i].getNum();
            }
        }
       for(int i = 0; i < n; i++) {
           if(vect[i].getNum() == maior){
               posicao = i;
           }
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Posição do maior número: " + posicao);
    }
}