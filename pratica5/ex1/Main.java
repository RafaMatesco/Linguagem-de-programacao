public class Main {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("11223344", "Carla", 2500.00);
		Funcionario f2 = new Funcionario("44332211", "Diego", 3200.50);

		double novoSalarioF1 = f1.aumentarSalario(10);
		double novoSalarioF2 = f2.aumentarSalario(5);

		System.out.println("\n--- Funcionários (após aumento) ---");
		System.out.println(f1 + "  (novo salario = " + novoSalarioF1 + ")");
		System.out.println(f2 + "  (novo salario = " + novoSalarioF2 + ")");
	}
}
