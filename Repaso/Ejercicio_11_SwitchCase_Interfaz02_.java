
package Repaso;

import java.util.Scanner;

public class Ejercicio_11_SwitchCase_Interfaz02_ {

    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Por favor, elige una opcion:");
            System.out.println("1. Opcion 1 (suma)"          );
            System.out.println("2. Opcion 2 (resta)"         );
            System.out.println("3. Opcion 3 (multiplicacion)");
            System.out.println("4. Opcion 4 (Salir)"         );
            opcion = scanner.nextInt();
            
            System.out.println("Digite Numero 1");
                double n1 = scanner.nextInt();
                System.out.println("Digite Numero 2");
                double n2 = scanner.nextInt();
                
        switch (opcion){
            // Suma
            case 1:
                System.out.println("Has seleccionado la opcion 1.(suma)");
                System.out.println("Digite Numero 1");
                double suma = n1+n2;
                System.out.println("La suma es: " + suma);
                break; 
            // Resta    
            case 2:
                System.out.println("Has seleccionado la opcion 2.(Resta).");
                double resta = n1-n2;
                System.out.println("La resta es: " + resta);
                break;
            // Multiplicación  
            case 3:
                System.out.println("Has seleccionado la opcion 3.(Serie (Multiplicacion)");
                double multiplicacion = n1*n2;
                System.out.println("La multiplicacion es: " + multiplicacion);
                break;
            //Salir  
            case 4:
                System.out.println("Has seleccionado la opcion 4.(salir).");
                System.out.println("Nos Vemosss!!!");
                break;
            } 
        } while (opcion != 4); 

    }
    
}
