package br.com.cacau;

public class ControleDeFluxo {
    public static void main(String args[]) {
        int nota1 = 3;
        int nota2 = 8;
        int nota3 = 7;
        int nota4 = 9;

        int media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Recuperação");
        } else if (media < 5) {
            System.out.println("Reprovado");
        }
    }
}
