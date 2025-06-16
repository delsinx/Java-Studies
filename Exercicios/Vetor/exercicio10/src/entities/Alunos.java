package entities;

public class Alunos {
    private String nome;
    private double nota1;
    private double nota2;


    public Alunos(){}

    public Alunos(String nome) {
        this.nome = nome;
    }

    public Alunos(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }


}



