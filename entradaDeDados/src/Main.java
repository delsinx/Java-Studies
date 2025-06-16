// First we need to import the library
import java.util.Scanner;

public class Main{
public static void main(String[] args){
//Create a object of scanner type

    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt(); // <- X gonna recieve a type data INT
    double y = sc.nextDouble(); //<- Y gonna recieve a type data Double
    String name = sc.next(); //<- gonna recieve a type data string
    // Utilizando somente o .next ira ler somente a primeira palavra
    // Para ler a linha inteira usar o .nextLine
    char z = sc.next().charAt(0); //<- gonna recieve a type data char

     sc.nextLine()


    sc.close(); // to close the scanner

    double result = (double) x + y;
    System.out.println(result + " and the name is " + name + " and the char is " + z);


}
}