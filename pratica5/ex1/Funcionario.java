public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String RG, String nome, double salario) {
        super(RG, nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aumentarSalario(double percentual) {
        if (percentual > 0) {
            salario += salario * percentual / 100;
        }
        return salario;
    }
}
