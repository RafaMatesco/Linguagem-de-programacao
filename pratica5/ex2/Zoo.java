public class Zoo {
    public static void main(String[] args) {
        Peixe p1 = new Peixe("Ronaldo", 10.4, "Água doce");
        Peixe p2 = new Peixe("Rgoério", 37.0, "Áquario");

        Cachorro c1 = new Cachorro("André", 17.3, "Cane corso");
        Cachorro c2 = new Cachorro("Ronaldo", 7.3, "Chiuaua");

        System.out.println("===Peixes===");
        System.out.println("-Nome: " + p1.getNome());
        System.out.println("-Peso: " + p1.getPeso());
        System.out.println("-Habitat: " + p1.getTipoHabitat());

        System.out.println("\n-Nome: " + p2.getNome());
        System.out.println("-Peso: " + p2.getPeso());
        System.out.println("-Habitat: " + p2.getTipoHabitat());

        System.out.println("\n===Cachorros===");
        System.out.println("-Nome: " + c1.getNome());
        System.out.println("-Peso: " + c1.getPeso());
        System.out.println("-Raça: " + c1.getRaca());

        System.out.println("\n-Nome: " + c2.getNome());
        System.out.println("-Peso: " + c2.getPeso());
        System.out.println("-Raça: " + c2.getRaca());
    }
}
