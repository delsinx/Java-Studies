import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Codigo        Especifidação        Preço");
        System.out.println("1             Cachorro Quente      R$ 4.00");
        System.out.println("2             X-Salada             R$ 4.50");
        System.out.println("3             X-Bacon              R$ 5.00");
        System.out.println("4             Torrada Simples      R$ 2.00");
        System.out.println("5             Refrigerante         R$ 1.50");

        System.out.println("Informe o codigo do produto desejado: ");
        int codigo = Integer.parseInt(sc.nextLine());
        System.out.println("Informe a quantidade do produto desejado: ");
        int quantidade = Integer.parseInt(sc.nextLine());

        if (codigo == 1) {
            System.out.println("Total: R$ " + 4 * quantidade);
        } else if (codigo == 2) {
            System.out.println("Total: R$ " + 4.5 * quantidade);
        } else if (codigo == 3) {
            System.out.println("Total: R$ " + 5 * quantidade);
        } else if (codigo == 4) {
            System.out.println("Total: R$ " + 2 * quantidade);
        } else if (codigo == 5) {
            System.out.println("Total: R$ " + 1.5 * quantidade);

        }else{
            System.out.println("Codigo invalido");
        }
    }
}

