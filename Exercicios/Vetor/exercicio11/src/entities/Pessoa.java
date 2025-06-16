package entities;

public class Pessoa {
    private double altura;
    private char genero;

    public Pessoa(double altura) {
        this.altura = altura;
    }

    public Pessoa(char genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public char getGenero() {
        return genero;
    }
}
