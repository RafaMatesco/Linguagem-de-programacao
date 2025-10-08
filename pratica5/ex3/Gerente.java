public class Gerente extends Funcionario {
    private String senha;

    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return this.senha;
    }

    public boolean autentica(String senha) {
        if (senha.equals(this.senha)) {
            return true;
        }
        return false;
    }
}
