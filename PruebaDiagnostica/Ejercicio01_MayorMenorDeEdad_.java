package PruebaDiagnostica;

import java.util.Scanner;

public class Ejercicio01_MayorMenorDeEdad_ {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int edad;
        
        System.out.println("Digite Su Edad");
        edad = scanner.nextInt();
        
        if (edad<18){
            System.out.println("Usted no es mayor de edad");
            
        } else {
            
            System.out.println("Usted es mayor de edad");
        }
    }
}
