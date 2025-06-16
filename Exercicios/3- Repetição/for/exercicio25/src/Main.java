import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de N: ");
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 1; i <= n; i++) {

            double calc = n % i;

            if(calc == 0){
                double div = n / i;
                System.out.println(div);
            }
        }


    }
}