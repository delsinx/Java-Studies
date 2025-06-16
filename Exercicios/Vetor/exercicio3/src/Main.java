import Pessoas.Pessoas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantas pessoas serão digitadas");
        int n = sc.nextInt();
        Pessoas[] dados = new Pessoas[n];
        double calc = 0;
        double contador = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite dados da " + (i + 1) + "ª pessoa");
            System.out.print("Nome:  ");
            String nome = sc.next();
            System.out.print("\nidade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();

            dados[i] = new Pessoas(nome, idade, altura);

            calc += dados[i].getAltura();

            if (dados[i].getIdade() < 16) {
                contador += 1;
            }
        }
        System.out.printf("Altura média: %.2f", (calc / n));
        double porcentagem = (contador / n) * 100;
        System.out.println("\nPessoas com menos de 16 anos: " + String.format("%.1f", porcentagem) + "%");
        for (int i = 0; i < n; i++) {
            if (dados[i].getIdade() < 16) {
                System.out.println(dados[i].getNome());
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(dados[i].getNome() + " - " + dados[i].getIdade() + " - " + dados[i].getAltura());
        }
    }
}