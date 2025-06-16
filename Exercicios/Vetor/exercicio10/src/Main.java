import java.sql.SQLOutput;
import java.util.Scanner;
import entities.Alunos;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serão digitados?");
         int n = sc.nextInt();
        Alunos aluno = new Alunos();

        Alunos[] nome = new Alunos[n];
        Alunos[] notas = new Alunos[n];
        Alunos[] notas2 = new Alunos[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite o nome do aluno: ");
            nome[i] = new Alunos(sc.next());
            System.out.print("Digite a primeira nota: ");
            notas[i] = new Alunos(sc.nextDouble(), 0);
            System.out.print("Insira a segunda nota: ");
            notas2[i] = new Alunos(0, sc.nextDouble());
            System.out.println("");
        }

        for(int i = 0; i < n; i++){
            double media =  ((notas[i].getNota1() +  notas2[i].getNota2()) / 2) ;
            if(media >= 6){
                System.out.println(nome[i].getNome() + " " + media + "  " + notas[i].getNota1() +  "  " + notas2[i].getNota2() );
            }
        }

    }
}