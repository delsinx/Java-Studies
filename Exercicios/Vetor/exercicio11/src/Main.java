import entities.Pessoa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double menor = 0;
        double maior = 0;
        double mediaM = 0;
        int contador = 0;
        int contadorH = 0;
        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Pessoa[] altura = new Pessoa[n];

        Pessoa[] sexo = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + " Pessoa: ");
            altura[i] = new Pessoa(sc.nextDouble());
            System.out.print("Genero da " + (i + 1) + " Pessoa: ");
            sexo[i] = new Pessoa(sc.next().charAt(0));

            if (altura[i].getAltura() < menor || menor == 0) {
                menor = altura[i].getAltura();
            } else if (altura[i].getAltura() > maior) {
                maior = altura[i].getAltura();
            }
            if (sexo[i].getGenero() == 'F' || sexo[i].getGenero() == 'f') {
                mediaM += altura[i].getAltura();
                contador++;
            } else {
                contadorH++;
            }

        }
        mediaM /= contador;
        System.out.println("Menor altura = " + menor);
        System.out.println("Maior altura = " + maior);
        System.out.println("Media das altura das mulheres = " + String.format("%.2f", mediaM));
        System.out.println("Numero de homens = " + contadorH);
    }
}