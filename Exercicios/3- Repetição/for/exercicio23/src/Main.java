
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade de numeros");
        int quantidade = Integer.parseInt(sc.nextLine());

        for(int cont = 0; cont < quantidade; cont++) {

            System.out.println("Insira o numero: ");
            double x = Double.parseDouble(sc.nextLine());
            System.out.println("Insira um segundo numero: ");
            double y = Double.parseDouble(sc.nextLine());

            double calculo = x%y;
            double calcDivisao = 0;

            if(y == 0){
                System.out.println("Impossivel dividir");


            }else{
                calcDivisao = x/y;
                System.out.println(calcDivisao);
            }


        }

    }
}