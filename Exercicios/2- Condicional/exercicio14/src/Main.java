import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do salário: ");
        double salario = Double.parseDouble(sc.nextLine());

        if(salario <= 2000.00){
            System.out.println("Isento");
        }else if(salario > 2000 &&  salario <= 3000) {
            double imposto = (salario - 2000) * 0.08;
            System.out.println("R$ " + imposto);
        }else if(salario > 3000 && salario <= 4500){
            double imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
            System.out.println("R$ " + imposto);
        }else if(salario > 4500){
            double imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
            System.out.println("R$ " + imposto);
        }
            






    }
}