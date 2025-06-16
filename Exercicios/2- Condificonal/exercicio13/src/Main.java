import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor de X");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.println("Insira o valor de Y");
        double y = Double.parseDouble(scanner.nextLine());

        if(x > 0 && y > 0){
            System.out.println("Quadrante 1");
        }else if(x < 0 && y > 0 ){
            System.out.println("Quadrante 2");
        }else if(x < 0 && y < 0){
            System.out.println("Quadrante 3");
        }else if(x > 0 && y < 0){
            System.out.println("Quadrante 4");
        }else{
            System.out.println("Origem");
        }

    }
}