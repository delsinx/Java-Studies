import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Delson");
        list.add("Pedro");
        list.add("carlos");
        list.add("joao");
        list.add("Diego");
        list.add("Maria");

        list.add(2, "jose");
        list.remove("Delson");
        for (String nome : list) {
            System.out.println(nome);
        }
        System.out.println("-------------------------------------");
        list.removeIf(x -> x.charAt(0) == 'D');
        for (String nome : list) {
            System.out.println(nome);
        }
        String result = list.stream().filter(x -> x.charAt(0) == 'c').findFirst().orElse(null);
        System.out.println(result);
    }
}