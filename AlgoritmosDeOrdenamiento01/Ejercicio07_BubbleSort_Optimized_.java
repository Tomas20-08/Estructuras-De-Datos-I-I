
package AlgoritmosDeOrdenamiento01;

import java.util.Arrays;

/**
 * Implementación optimizada de Bubble Sort.
 * Detiene el recorrido si en una pasada no se realizan intercambios.
 */
public class Ejercicio07_BubbleSort_Optimized_ {

    /**
     * Ordena un arreglo de enteros en orden ascendente usando Bubble Sort.
     */
    void bubbleSort(int[] array) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            boolean swapped = false; // marcará si hubo algún intercambio

            for (int j = 0; j < size - i - 1; j++) {
                // Cambiar '>' por '<' para orden descendente
                if (array[j] > array[j + 1]) {
                    // Intercambio
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!swapped) break;
        }
    }

    /**
     * Punto de entrada del programa.
     */
    public static void main(String[] args) {
        int[] data = { -2, 45, 0, 11, -9 };

        Ejercicio07_BubbleSort_Optimized_ bs = new Ejercicio07_BubbleSort_Optimized_();
        bs.bubbleSort(data);

        System.out.println("Arreglo ordenado en orden ascendente:");
        System.out.println(Arrays.toString(data));
    }
}