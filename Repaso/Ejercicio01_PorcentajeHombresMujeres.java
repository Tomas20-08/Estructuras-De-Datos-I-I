
package Repaso;

import java.util.*; //Scanner

public class Ejercicio01_PorcentajeHombresMujeres {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int h,m;
        float ph,pm;
        
        System.out.println("Digite el numero de Hombres");
        h = scanner.nextInt();
        
        System.out.println("Diite el numero de Mujeres");
        m = scanner.nextInt();
        
        float total = h+m;
        
        ph= 100*h /(total);
        
        pm = 100*m /(total);
        
        System.out.println("Porcentaje de Hombres: "+ph+"%");
        
        System.out.println("Porcentaje de Mujeres: "+pm+"%");
        

    }
    
}
