
package ArrayUnidimensionales;

import java.util.Scanner;

public class Ejemplo05_SumaArray_ {

    public static void main(String[] args) {
        
        int n;
           
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite la cantidad de numeros a ingresar: ");
        n = scanner.nextInt();
        
        int[] num = new int[n];
        int i, suma = 0 ; 
        
        for (i = 0; i < n; i++){
            System.out.println("Digite num " + (i + 1)+ ":");
            num[i] = scanner.nextInt();

            
            suma += num[i];
            
        }
        
        System.out.println("La suma es: " + suma) ;

    }
    
}
