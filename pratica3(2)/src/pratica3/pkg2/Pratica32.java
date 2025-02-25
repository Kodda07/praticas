
package pratica3.pkg2;

import java.util.Random;

public class Pratica32 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(100) + 1; // Número aleatório entre 1 e 100
            }
        }
        
        System.out.println("Matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Calculando e imprimindo a soma dos elementos de cada linha
        System.out.println("\nSoma dos elementos de cada linha:");
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Soma da linha " + (i + 1) + ": " + somaLinha);
    }
    }
        
}