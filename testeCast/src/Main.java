import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        int a, b;
        double result;

        a = 5;
        b = 2;
        // if don't use explict cast the result are 2 because the int (a and b) are a type int
        // and the result of int * int are int

        result = (double) a / b;

        System.out.println(result);
    }
}