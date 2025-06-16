
import java.util.Scanner;
import entities.Employee;



public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Employee emp = new Employee();

    System.out.println("Insira o nome do funcionario: ");
    emp.name = sc.nextLine();
    System.out.println("Insira o salario liquido do funcionario: ");
    emp.salary = sc.nextDouble();
    System.out.println("Insira a taxa do salario: ");
    emp.tax = sc.nextDouble();

    System.out.println("Employee: " + emp.name + ", $" + String.format ("%.2f", emp.salary) );

    System.out.println("Gostaria de incrementar quanto no salario do funcionario?");
    emp.IncreaseSalary(sc.nextDouble());

    System.out.println("Updated data: " + emp.name + ", $" + String.format ("%.2f", emp.NetSalary()));

    }
}