package entities;

public class alunos {

    public String name;
    public double a1;
    public double a2;
    public double a3;




    public alunos(String name, double a1, double a2, double a3) {
        this.name = name;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;


    }

    public alunos(String name, double a1, double a2) {
        this.name = name;
        this.a1 = a1;
        this.a2 = a2;
        a3 = 1;

    }

    public String notas() {
        double nota = a1 + a2 + a3;

        if (nota < 60) {
            double falta = 60 - nota;
            return "Final grade = " + String.format("%.2f", nota) + " \nFAILED \nMISSING " + String.format("%.2f", falta) + " Points";
        } else {
            return "Final grade = " + String.format("%.2f", nota) + " \nPASS";
        }

    }

}
