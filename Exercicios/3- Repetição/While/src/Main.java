import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner sc =   new Scanner(System.in);

        int cont = sc.nextInt() ;

        while(cont != 0){
            cont--;
            System.out.println(cont + 1);
        }
    }
}