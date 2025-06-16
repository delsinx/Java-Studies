import java.sql.SQLOutput;
import java.util.Scanner;
import entitites.Numbers;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double mediaPares =0;
    int cont =0;

        System.out.println("Quantos elementos o vetor vai ter? ");
        int n = sc.nextInt();
        Numbers[] vect = new Numbers[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            vect[i] = new Numbers(num);

            if(vect[i].getNum() % 2 == 0){
                mediaPares += vect[i].getNum();
                cont++;
            }
        }
        if (mediaPares > 0) {
            mediaPares = mediaPares/cont;
            System.out.println("\nMedia dos pares = " + mediaPares);
        }else{
            System.out.println("NENHUM NÚMERO PAR");
        }

    }
}