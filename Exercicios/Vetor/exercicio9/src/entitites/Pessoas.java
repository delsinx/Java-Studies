package entitites;

public class Pessoas {
    private String nome;
    private int idade;

    public Pessoas(String nome) {
        this.nome = nome;
    }

    public Pessoas(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
