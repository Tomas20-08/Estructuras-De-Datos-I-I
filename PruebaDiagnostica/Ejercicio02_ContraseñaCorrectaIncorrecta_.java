
package PruebaDiagnostica;

import java.util.Scanner;

public class Ejercicio02_ContraseñaCorrectaIncorrecta_ {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String contraseña;
        String conf;
        
        System.out.println("Digite una contrasena");
        contraseña = scanner.next();
        
        System.out.println("Confirme su contrasena");
        conf = scanner.next();
        
        if (contraseña.equals(conf)){
            
            System.out.println("Su contasena es correcta");
            
        } else {
            
            System.out.println("Su contrasena es incorrecta");
            
        }
    }
}
