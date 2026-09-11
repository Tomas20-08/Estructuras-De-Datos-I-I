/*1. Crea un programa en java que permita cargar el 
nombre de 5 personas y sus edades respectivas. Se 
debe imprimir el nombre y edad de las personas 
mayores de edad. (2.0)*/

package TallerEstructurasDeDatosCorte1;

import javax.swing.JOptionPane;

public class Ejercicio01_InsertionSort_ {

    public static void main(String[] args) {
 
        //Declaracion de variableS
       String nombre[];
       int edad[];
       int pos;
       String aux;
       int auxiliar;
       String n = " ";
       nombre = new String[5];
       edad = new int[5];
       //Usuario Ingresa Nombre de las canciones
       for(int i = 0; i<5; i++){
          nombre[i] = JOptionPane.showInputDialog("Ingrese nombre... " + (i + 1));
       }
       for(int i = 0; i<5; i++){
           edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de... " + nombre[i]));
       }
       for(int i = 0; i<5; i++){
       if(edad[i]>=18){
          System.out.println("Las personas Mayores de edad (18<=Persona) son: " + nombre[i]);
       }else{
           System.out.println("Las personas Menores de edad (18>Persona) son: " + nombre[i]);
       }
       }
       //Metodo Incersión
       for(int i = 0; i < 5; i++){
           pos = i;
           aux = nombre[i];
           while((pos>0)&&(nombre[pos-1].compareTo(aux)>0)){
           nombre[pos] = nombre[pos-1];
                   pos--;
           }
          nombre[pos] = aux;
        }
       for(int i = 0; i < 5; i++){
           pos = i;
           auxiliar = edad[i];
           while((pos>0)&&(edad[pos-1]>auxiliar)){
           edad[pos] = edad[pos-1];
                   pos--;
           }
           edad[pos] = auxiliar;
         }
 
       
       for (int i = 0; i< 5; i++){
           n = n + nombre[i] + " - ";
 
       }
       System.out.println("");
        System.out.println("Nombres en Orden Alfabetico");
       for(int i = 0; i<5; i++){
          System.out.println(nombre[i]);
       }
        System.out.println("");
        System.out.println("Edades en Orden numerico");
       for(int i = 0; i<5; i++){
        System.out.println(edad[i]);
       }

}
}