package AlgoritmosDeOrdenamiento01;

import javax.swing.JOptionPane;

public class Ejemplo01_Burbuja_ {
    
    public static void main(String[] args) {
        
        //Declaracion de variables
       int arreglo[],nElementos, aux;
       String n = " ";
       
       //Usuario ingresa cantidad de numeros
       nElementos = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese la cantidad de elementos de la recta "));
       arreglo = new int [nElementos];
       
       //Usuario Ingresa Numeros
       for(int i = 0; i<nElementos; i++){
           arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero... " + (i + 1)));
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
       for(int i=0; i<nElementos; i++){
           System.out.println("Posicion " + i + " Numero... " + arreglo[i]);
             }
       
       //Impresión con Joptionpane
       for (int i = 0; i<nElementos; i++){
           n = n + arreglo[i]+" - ";
       }
       JOptionPane.showMessageDialog(null,"Los numeros en orden son ... " + n);
    }
}

 