import Entities.Rectangle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         Rectangle rec;

         rec = new Rectangle();


       System.out.println("Enter rectagle width and height: ");
       System.out.println("width: ");
       rec.width = Double.parseDouble(sc.nextLine());
       System.out.println("height: ");
       rec.height = Double.parseDouble(sc.nextLine());


        System.out.println(rec);
    }
}