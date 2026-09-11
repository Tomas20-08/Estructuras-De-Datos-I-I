
package Repaso;

import java.util.Scanner;

public class Ejercicio04_SwitchCase_Interfaz01_ {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = scanner.nextInt();
        
        switch(num){
             
            case 1:System.out.println("Ingreso opcion 1");
            break;
            case 2:System.out.println("Ingreso opcion 2");
            break;
            case 3:System.out.println("Ingreso opcion 3");
            break;
            case 4:System.out.println("Ingreso opcion 4");
            break;
            default:System.out.println("Numero invalido");
            
        }

    }
    
}
