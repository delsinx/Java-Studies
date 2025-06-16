package Pessoas;

public class Pessoas {
    private String nome;
    private int idade;
    private double altura;

    public Pessoas(String nome, int idade,  double altura) {
        this.idade = idade;
        this.nome = nome;
        this.altura = altura;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }
    public int getIdade() {
        return idade;
    }
}
