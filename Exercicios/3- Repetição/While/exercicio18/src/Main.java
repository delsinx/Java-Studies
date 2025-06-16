import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Insert the password: ");
            double pass = Double.parseDouble(sc.nextLine());

            while(pass != 2002){
                System.out.println("Incorrect password");
                System.out.println(" ");
                System.out.println("Insert the password again: ");
                pass = Double.parseDouble(sc.nextLine());

            }
            System.out.println("Access allowed");



    }
}