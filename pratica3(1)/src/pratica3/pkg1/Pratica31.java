
package pratica3.pkg1;

import java.util.Scanner;


public class Pratica31 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] altura = new int[10];
        int media=0;

        for(int i=0; i< altura.length;i++){
            System.out.println("Digite a altura em cm: ");
            altura[i] = scan.nextInt();
        }
        for(int i=0;i<altura.length;i++){
            media +=altura[i] / 10;
        }
        System.out.println("A media e: "+media);
        System.out.println("tamanho do array: "+altura.length);
    }
    
}
