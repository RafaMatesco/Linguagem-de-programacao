public class Empresa {
    public static void main(String[] args) {
        Gerente f1 = new Gerente("Ronaldo", "49010304", 10000.20, "ronaldo123");
        Gerente f2 = new Gerente("Rogério", "49010304", 34579.25, "rogerio123");

        System.out.println("===Gerentes===");
        System.out.println("-Nome: " + f1.getNome());
        System.out.println("-cpf: " + f1.getCpf());
        System.out.println("-salario: " + f1.getSalario());
        System.out.println("-senha: " + f1.getSenha());
    }
}
