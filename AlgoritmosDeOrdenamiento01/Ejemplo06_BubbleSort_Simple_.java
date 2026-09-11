
package AlgoritmosDeOrdenamiento01;

import java.util.Arrays;

/**
 * Ejemplo de implementación del algoritmo Bubble Sort (versión básica).
 * Recorre el arreglo varias veces e intercambia pares desordenados.
 */
public class Ejemplo06_BubbleSort_Simple_ {

    /**
     * Método que ordena un arreglo de enteros en orden ascendente.
     */
    void bubbleSort(int[] array) {
        int size = array.length;

        // Primer bucle recorre todas las posiciones menos la última
        for (int i = 0; i < size - 1; i++) {
            // Segundo bucle realiza las comparaciones y posibles intercambios
            for (int j = 0; j < size - i - 1; j++) {
                // Para ordenar en descendente basta con cambiar '>' por '<'
                if (array[j] > array[j + 1]) {
                    // Intercambio de posiciones
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Punto de entrada del programa: crea un arreglo, lo ordena e imprime.
     */
    public static void main(String[] args) {
        int[] data = { -2, 45, 0, 11, -9 };

        Ejemplo06_BubbleSort_Simple_ bs = new Ejemplo06_BubbleSort_Simple_();
        bs.bubbleSort(data);

        System.out.println("Arreglo ordenado en orden ascendente:");
        System.out.println(Arrays.toString(data));
    }
}