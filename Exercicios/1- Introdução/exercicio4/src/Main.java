import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número do funcionario: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Insira o número de horas trabalhadas: ");
        int horas = Integer.parseInt(sc.nextLine());
        System.out.println("Insira o valor por hora trabalhada: ");
        double horaTrabalhada = Double.parseDouble(sc.nextLine());

        double salario = (double) horas * horaTrabalhada;

        System.out.println("NUmero: " + numero );
        System.out.println("Salario: R$ " + salario);


    }
}