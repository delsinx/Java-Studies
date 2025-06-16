import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a cordenada X: ");
        double x = Double.parseDouble(sc.next());
        System.out.println("Insira a cordenada Y: ");
        double y = Double.parseDouble(sc.next());

        while (x != 0 && y !=0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
                break;

            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
                break;

            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
                break;

            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
                break;
            }
        }
        System.out.println("Origem");
    }
}