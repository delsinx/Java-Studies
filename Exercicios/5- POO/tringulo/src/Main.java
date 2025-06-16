import java.util.*;

public class Main {
    public static void main(String[] args) {

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        System.out.println("O tamanho da area é " + x.area());
        System.out.println("O tamanho da area é " + x.area());
        System.out.println("O tamanho da area é " + y.area());

        if (x.area() > y.area()) {
            System.out.println("Triangle X is bigger than Triangle Y");
        } else {
            System.out.println("Triangle Y is bigger than Triangle X");
        }

        sc.close();

    }
}