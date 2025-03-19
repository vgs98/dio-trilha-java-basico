public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 50.0;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

        System.out.println("O valor depois do saque é " + saldo);
        }else {
            System.out.println("Saque negado, saldo insuficiente, seu saldo atual é de: " + saldo);
        }    
    }
}