import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {

    System.out.println("Discando...");

    do { 
        // tocando até alguem atender
        System.out.println("Telefone tocando");

    } while (tocando());
    
    System.out.println("Alô, quem fala? ...");

}
private static boolean tocando(){

        boolean atendeu = new Random().nextInt(8) <= 3;
        System.out.println("Atendeu? " +atendeu);
        // cancela o toque e reporta atendido
        return ! atendeu;
    }
}
