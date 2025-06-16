import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o codigo da peça: ");
        int codigo = Integer.parseInt(sc.nextLine());
        System.out.println("Insira a quantidade de peças: ");
        int quantidade = Integer.parseInt(sc.nextLine());
        System.out.println("Insira o valor unitacrio da peça:");
        double valor = Double.parseDouble(sc.nextLine());
        double calculo = quantidade * valor;

        System.out.println("Insira o codigo da peça 2: ");
         codigo = Integer.parseInt(sc.nextLine());
        System.out.println("Insira a quantidade de peças: ");
        quantidade = Integer.parseInt(sc.nextLine());
        System.out.println("Insira o valor unitacrio da peça:");
        valor = Double.parseDouble(sc.nextLine());

        calculo = calculo + (quantidade * valor);

        System.out.println("O valor total a ser pago é de : R$ " + );



    }
}