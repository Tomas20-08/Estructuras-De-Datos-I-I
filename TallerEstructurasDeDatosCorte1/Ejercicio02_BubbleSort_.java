/*2. Después de una carrera, los organizadores necesitan 
ordenar los tiempos de los participantes para conocer 
quiénes fueron los más rápidos. Utiliza el algoritmo de 
burbuja para organizar los tiempos.
Se desea crear un programa que solicite al usuario 
ingresar los tiempos de finalización de una carrera para 
N participantes. Utiliza el algoritmo de ordenamiento 
burbuja para ordenar los tiempos en orden ascendente 
y muestra los resultados ordenados en minutos. Valor del ejercicio: 3.0*/

package TallerEstructurasDeDatosCorte1;
 
import javax.swing.JOptionPane;

public class Ejercicio02_BubbleSort_ {

    public static void main(String[] args) {
        //Declaracion de variables
       int nElementos;
       double arreglo[],aux;
       String n = " ";
       //Usuario ingresa cantidad de numeros
       nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de participantes "));
       arreglo = new double [nElementos];
       JOptionPane.showMessageDialog(null, "Número de participantes: " +nElementos);
       //Usuario Ingresa Numeros
       for(int i = 0; i<nElementos; i++){
           arreglo[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo (en minutos) del participante: " + (i + 1)));
       }
        //Metodo Burbuja
       for(int i=0; i<nElementos; i++){
           for(int j=0; j<(nElementos-1); j++){
               if(arreglo[j] > arreglo[j+1]) {
                   aux = arreglo[j];
                   arreglo[j] = arreglo[j+1];
                   arreglo[j+1] = aux;
               }  
           }
        }
       //Impresion con System.our.Println
 
       for(int i= 0; i<nElementos; i++){
           System.out.println("Posicion Participante " + (i+1) + " Tiempo: " +arreglo[i]);
    }
 
       
       //Impresión con Joptionpane
       for (int i = 0; i<nElementos; i++){
           n = n + arreglo[i]+" min - ";
       }
       JOptionPane.showMessageDialog(null,"el tiempo de los participantes en orden es ... " + n);
    }
 
    }