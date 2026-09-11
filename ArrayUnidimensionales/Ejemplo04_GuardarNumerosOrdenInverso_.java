
package ArrayUnidimensionales;

import java.util.Scanner;

public class Ejemplo04_GuardarNumerosOrdenInverso_ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        
        String[]nombre = new String[5];
        
        int x = 6;
        
                for(int i=0; i<5; i++){
                    System.out.println("Digite nombre " + (i + 1 )+ ":");
                    nombre[i] = scanner.next();
                }
                
                for (int i = 4; i>=0; i--){
                    x--;
                    
                    System.out.println("posicion "+ i + "     Nombre " + x +"..." + nombre[i]);
                    
        }
    }
    
}
