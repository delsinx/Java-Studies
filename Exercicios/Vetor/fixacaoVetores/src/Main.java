import entities.Estudantes;
import java.util.Arrays;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estudantes[] quarto = new Estudantes[9];

        System.out.println("Quantos estudantes irão alugar quartos? ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Qual quarto deseja alugar? ");
            int quartoAlugado = sc.nextInt();
            System.out.println("Insira o seu nome:");
            String nome = sc.next();
            System.out.println("Insira o seu email:");
            String email = sc.next();
            quarto[quartoAlugado] = new Estudantes(nome, email, quartoAlugado);
        }

        for(int i = 0; i< 9;i++){

            if(quarto[i] != null){
                System.out.println(quarto[i].getQuarto() + ": " + quarto[i].getNome() + ", 3" + quarto[i].getEmail());

            }
        }
        sc.close();
    }
}