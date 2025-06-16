import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o horario que o jogo inicia: ");
        int inicial = Integer.parseInt(sc.nextLine());

        System.out.println("Insira a hora que o jogo termina: ");
        int terminal = Integer.parseInt(sc.nextLine());

        int calculo = inicial - terminal;
        if(inicial < terminal){
            System.out.println("O jogo durou " +  Math.abs(calculo) + " horas");
        }else if(inicial > terminal){
            System.out.println("O jogo durou " +  Math.abs(24- calculo) + " horas");
        }else {
            System.out.println("O jogo durou 24 horas");
        }
    }
}