import entities.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<Employee>();

        System.out.println("Quantos funcionarios serão registrados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Insira o id do funcionario:");
            Integer id =  sc.nextInt();
            System.out.println("Insira o nome do funcionario: ");
            String nome =  sc.next();
            sc.nextLine();
            System.out.println("Insira o salario do funcionario: ");
            Double salario = sc.nextDouble();
            list.add(new Employee(id, nome, salario));
        }

        System.out.println("Insira o id do funcionario que terá o salario aumentado: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null); // Busca o index do id na lista;

        if (emp == null) {
            System.out.println("Este id não existe!");
        } else {
            System.out.println("Insira a porcentagem: ");
            double porcentagem = sc.nextDouble();
            emp.aumentarSalario(porcentagem);
        }

        for (Employee employee : list) {
            System.out.println(employee.getId() + ", " + employee.getName() + ", " + employee.getSalary());
        }


    }
}