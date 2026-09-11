//Ejercicio 01 Algoritmo de Ordenamiento por inserción

package AlgoritmosDeOrdenamiento01;

import javax.swing.JOptionPane;

public class Ejemplo03_Ejercicio01_Incersion_ {

    public static void main(String[] args) {

        //Declaracion de variableS
       String cancion[];
       int pos;
       String aux;
       String n = " ";
       cancion = new String[5];
       
       //Usuario Ingresa Nombre de las canciones
       for(int i = 0; i<5; i++){
          cancion[i] = JOptionPane.showInputDialog("Ingrese Nombre de la canción... " + (i + 1));
       }
       
       //Metodo Incersión
       for(int i = 0; i < 5; i++){
           pos = i;
           aux = cancion[i];
           
           while((pos>0)&&(cancion[pos-1].compareTo(aux)>0)){
           cancion[pos] = cancion[pos-1];
                   pos--;
   
           }
          cancion[pos] = aux;
        }
       
       for (int i = 0; i< 5; i++){
           n = n + cancion[i] + " - ";

       }
           JOptionPane.showMessageDialog(null,"El orden de las cacniones es... " + n);
    }
}