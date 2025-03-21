import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio(); // Corrigido o erro de sintaxe
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho"); // Adicionado ponto e vírgula
            mesada -= valorDoce; // Corrigida a subtração
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces.");
    }

    // Método para gerar um valor aleatório entre 2 e 10
    public static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 10);
    }
}