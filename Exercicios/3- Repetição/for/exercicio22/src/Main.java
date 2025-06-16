import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira a quantidade : ");
    int n = Integer.parseInt(sc.nextLine());
    int in = 0;
    int out = 0;

    for (int cont = 1; cont <= n; cont++) {
      System.out.println("Insira um numero");
      int num = Integer.parseInt(sc.nextLine());
      if (num >= 10 && num <= 20) {
        in = in + 1;
      } else {
        out = out + 1;
      }
    }
    System.out.println(in + " in");
    System.out.println(out + " out");
  }
}
