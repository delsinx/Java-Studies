import entities.operations;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id of the account: ");
        int id = sc.nextInt();

        System.out.println("Enter the name of account: ");
        String name = sc.next();
        operations client = new operations(id, name);

        System.out.println("Want to make first deposit? Y/N: ");
        String answer = sc.next();

        if (answer.equals("Y") || answer.equals("Yes") || answer.equals("yes") || answer.equals("y")) {
            System.out.println("How much u want to initial deposit? ");
            double amount = sc.nextDouble();
            client.setIncreasedAmount(amount);
            System.out.println("Account data:");


        } else {
            System.out.println("Account data:");

        }
        System.out.println(client.toString());

        System.out.println("Enter a deposit value: ");
        client.setIncreasedAmount(sc.nextDouble());
        System.out.println(client.toString());

        System.out.println("Enter a withdraw value: ");
        client.setDecreasedAmount(sc.nextDouble());
        System.out.println(client.toString());
        

    }
}