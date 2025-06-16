import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.println("Insira a quantidade de minutos: ");
          double minutos = Double.parseDouble(sc.nextLine());

          if(minutos <= 100){
              System.out.println("Valor a pagar: R$ 50,00");
          }else{
              double calculo = ((minutos - 100) * 2) + 50;
              System.out.println("Valor a pagar: R$ " + calculo);
          }


    }
}