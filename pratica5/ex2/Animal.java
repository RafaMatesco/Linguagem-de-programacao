public class Animal {
    protected String nome;
    protected double peso;

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPeso() {
        return this.peso;
    }
}
