import entities.alunos;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o nome do aluno: ");
        String name = sc.nextLine();
        System.out.print("A1: ");
        double a1 = sc.nextDouble();
        System.out.print("A2: ");
        double a2 = sc.nextDouble();
        System.out.print("A3: ");
        double a3 = sc.nextDouble();

        alunos aluno = new alunos(name, a1, a2, a3);

        System.out.print(aluno.notas());


    }
}