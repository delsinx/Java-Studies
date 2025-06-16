import entitites.Pessoas;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int comparador = 0;
        String pessoa =" ";

        System.out.println("Quantas pessoas voce vai digitar: ");
        int n = sc.nextInt();

        Pessoas[] nome = new Pessoas[n];
        Pessoas[] idade = new Pessoas[n];

        for (int i = 0; i < n; i++) {
            System.out.println(("Dados da " + (i +1) + "° pessoa: "));
            System.out.print("Nome: ");
            nome[i] = new Pessoas(sc.next());
            System.out.print("Idade: ");
            idade[i] = new Pessoas(sc.nextInt());
        }
        for(int i =0; i<n;i++){
            if(idade[i].getIdade() > comparador){
                comparador = idade[i].getIdade();
                pessoa = nome[i].getNome();

            }
        }
        System.out.println("Pessoa mais velha: " + pessoa + " com " + comparador + " anos.");
    }
}