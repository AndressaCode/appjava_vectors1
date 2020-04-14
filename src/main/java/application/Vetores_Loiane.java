/* Criar um vetor A com 5 elementos inteiros. Construir um vetor
 * B de mesmo tipo e tamanho e com os "mesmos" elementos do vetor A,
 * ou seja, B[i] = A[i].
 */
package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */

public class Vetores_Loiane {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int vetA[] = new int [5];
        int vetB[] = new int [5];
        
        for(int i=0; i<vetA.length; i++){
            System.out.print("Element position " +i + ": ");
            vetA[i] = sc.nextInt();
            vetB[i] = vetA[i];
        }
        System.out.println();
        System.out.print("Vector A = "); 
        for(int i=0; i<vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println();
        System.out.print("Vector B = ");
        for(int i=0; i<vetA.length; i++){
            System.out.print(vetB[i] + " ");
        }
    }
}