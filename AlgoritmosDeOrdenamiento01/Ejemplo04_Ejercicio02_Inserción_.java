//Ejercicio 02 Algoritmo de Ordenamiento por inserción

package AlgoritmosDeOrdenamiento01;

import javax.swing.JOptionPane;

public class Ejemplo04_Ejercicio02_Inserción_ {

    public static void main(String[] args) {
        
         //Variables
        int pos, cont1 = 0, cont2 = 0;;
        double aux;

        //Arreglo Unidimensional
        double notas[] = new double[5];
        
        //Entrada de Datos (JOptionpane)
        for(int i=0; i<5; i++){
            
            while(true){
            
           notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del estudiante #"+(i+1)+" (Notas entre 0.0 y 5.0)"));
           
           //Validación
           if (notas[i] >= 0.0 && notas[i] <= 5.0){
               System.out.println("La Nota del estudiante #"+ (i+1) +" ha sido validada exitosamente. Nota: " + notas[i]);
               break;
               
           }else{
               JOptionPane.showMessageDialog(null, "Invalid Input. La nota debe estar entre 0.0 y 5.0.");
               
                }
            }
        }
            
        //Ordenamiento por metodo de inserción
        for (int i=0;i<5;i++){
            pos = i;
            aux = notas[i];
            while ((pos>0) && (notas[pos-1])<aux){
                notas[pos] = notas[pos-1];
                pos--;
            }
                notas [pos] = aux;
        }
        
        //Impresion Por JOptionpane           
         String s = " ";
         
         for (int i=0;i<5;i++){
         s += notas[i] + " - ";
    }
        JOptionPane.showMessageDialog(null, "Las notas en orden son: " + s);
        
        System.out.println("Estudiante ");
        
        //Aprueba No Aprueba
    for (int i = 0; i < 5; i++) {
    if (notas[i] >= 3.0) {
        cont1++;
    } else {
        cont2++;     
    }
}
 
System.out.println("Aprobaron: " + cont1 + " estudiantes");
System.out.println("No Aprobaron: " + cont2 + "estudiantes");
 
            //Promedio del curso
        double suma = 0 ,prom;
        for(int i=0;i<5;i++){
        suma = notas[i]+suma;
        }
        prom = suma/5 ;
            System.out.println("El promedio de los estudiantes es: " + prom);
            
        }
    }
