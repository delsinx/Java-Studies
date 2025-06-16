import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira um número inteiro: ");
    int x = sc.nextInt();

    int calc =  x % 2;

    if( calc == 0){
        System.out.println("O número é par");
    }else{
        System.out.println("O número é impar");
    }


    }
}