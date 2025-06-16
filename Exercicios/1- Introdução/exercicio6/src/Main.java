import java.util.Scanner;

class  Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de A: ");
        double a = Double.parseDouble(sc.nextLine()) ;

        System.out.println("Insira o valor de B: ");
        double b = Double.parseDouble(sc.nextLine()) ;

        System.out.println("Insira o valor de C: ");
        double c = Double.parseDouble(sc.nextLine()) ;

        double areaTringuloRetangulo = (a * c) / 2;
        System.out.println("Triangulo: " + String.format("%.3f", areaTringuloRetangulo));

        double areaCirculo = 3.14159 * Math.pow(c, 2);
        System.out.println("Circulo: " + String.format("%.3f", areaCirculo));

        double areaTrapezio = ((a + b) * c) / 2;
        System.out.println("Trapezio: " + String.format("%.3f", areaTrapezio));

        double areaQuadrado = Math.pow(b, 2);
        System.out.println("Quadrado: " + String.format("%.3f", areaQuadrado));

        double areaRetangulo = a * b;
        System.out.println("Retangulo: " + String.format("%.3f",areaRetangulo));

        
    }
}