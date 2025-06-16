import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Fim");

            int escolha = Integer.parseInt(sc.next());

            while(escolha != 4){
               if(escolha == 1){
                   System.out.println("Álcool: 1");
                   break;
               }else if(escolha == 2) {
                   System.out.println("Gasolina: 2");
                   break;
               }else if(escolha == 3){
                     System.out.println("Diesel: 3");
                   break;
               }else if(escolha == 4){
                   System.out.println("Fim");
                    escolha = 4;

               }else{
                   System.out.println("Insira uma opção valida");
                   escolha = Integer.parseInt(sc.next());
               }


            }

    }
}