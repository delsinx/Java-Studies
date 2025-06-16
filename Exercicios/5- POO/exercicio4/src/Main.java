import java.util.Scanner;
import util.CurrencyConverter;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price: ");
        double price = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        System.out.print("Amout to be paid in reais = "+ CurrencyConverter.converter(price, amount));

    }
}