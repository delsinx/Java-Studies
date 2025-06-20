package entities;

public class Estudantes {
    private String nome;
    private String email;
    private int quarto;

    public Estudantes(String nome, String email, int quarto) {
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
