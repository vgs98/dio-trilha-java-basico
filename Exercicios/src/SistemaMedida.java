public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "P";

        switch (sigla) {
            case "P" -> System.out.println("PEQUENO");
            case "M" -> System.out.println("MEDIO");
            case "G" -> System.out.println("GRANDE");
            default -> System.out.println("INDEFINIDO");
        }
    }
}
