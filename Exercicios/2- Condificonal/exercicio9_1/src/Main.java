import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor de A e B em ordem crescente para checar se são multiplos: ");
        System.out.println("Insira o valor de A: ");
        int a = sc.nextInt();
        System.out.println("insira o valor de B: ");
        int b = sc.nextInt();

        if(b % a == 0 || a % b == 0 ) {

            System.out.println("São multiplos");
        }else{
            System.out.println("Não são multiplos");
        }
    }
}