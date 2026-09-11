
package Repaso;

import java.util.Scanner;

public class Ejercicio05_Condicionales_Interfaz_ {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = scanner.nextInt();
        
        if(num==1){
            System.out.println("Ingreso opcion 1");
        }else if(num==2){
            System.out.println("Ingreso opcion 2");
        }else if(num==3){
            System.out.println("Ingreso opcion 3");
        }else if(num==4){
            System.out.println("Ingreso opcion 4");
        }else if(num>4){
            System.out.println("Ingreso opcion invalida");
        }
    }
}
