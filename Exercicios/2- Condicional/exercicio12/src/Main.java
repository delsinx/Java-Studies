import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");

        double num = Double.parseDouble(sc.nextLine());

        if(num >= 0 && num <= 25.00 ){
            System.out.println("Intervalo [0,25]");
        } else if (num >=25.01 && num <= 50.00){
            System.out.println("Intervalo [25,50]");
        }else if (num >= 50.01 && num <= 75.00){
            System.out.println("Intervalo [50,75]");
        }else if(num >= 75.01 && num <= 100.00){
            System.out.println("Intervalo [75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }

    }
}