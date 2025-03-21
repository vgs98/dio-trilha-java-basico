public class ExemploForArray {
    public static void main(String[] args) {
        // em arrays o indice inicia em 0 
        String alunos[] = {"FELIPE","JONAS", "JULIA", "MARCOS" };

    /* // forma mais longa de fazer     
    for (int x=0; x<alunos.length; x++) {
        System.out.println("O aluno no indice x=" + x + " é " + alunos[ x ] );
    } */
    
    // usando for each 
    for(String aluno : alunos){
        System.out.println("Nome do aluno é:" + aluno);
    }

    }
}

