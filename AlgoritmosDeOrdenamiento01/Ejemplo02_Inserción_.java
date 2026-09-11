package AlgoritmosDeOrdenamiento01;

import javax.swing.JOptionPane;

public class Ejemplo02_Inserción_ {

    public static void main(String[] args) {

        //Declaracion de variables
       int arreglo[],nElementos, aux, pos;
       String s = " ";

       //Usuario ingresa cantidad de numeros
       nElementos = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese la cantidad de elementos de la recta "));
       arreglo = new int [nElementos];

       //Usuario Ingresa Numeros
       for(int i = 0; i<nElementos; i++){
           arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero... " + (i + 1)));
       }
       
       //Metodo Incersión
       for(int i = 0; i < nElementos; i++){
           pos = i;
           aux = arreglo[i];
      
           while((pos>0)&&(arreglo[pos-1]>aux)){
           arreglo[pos] = arreglo[pos-1];
                   pos--;
               
           }
           arreglo[pos] = aux;
         }
       
       for (int i = 0; i<nElementos; i++){

           s = s + arreglo[i] + " - ";

       }
          JOptionPane.showMessageDialog(null,"los numeros en orden son ... " + s);
    }
}


