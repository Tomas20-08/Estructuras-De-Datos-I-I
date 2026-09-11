
package AlgoritmosDeOrdenamiento01;

/**
 * Ejemplo de implementación del algoritmo de ordenación por inserción.
 */
public class Ejercicio08_InsertionSort_ {

    /**
     * Ordena un arreglo de enteros en orden ascendente.
     */
    void sort(int[] arr) {
        int n = arr.length;

        // Comenzamos desde el segundo elemento
        for (int i = 1; i < n; ++i) {
            int key = arr[i];    // elemento actual
            int j = i - 1;

            // Desplazar los elementos mayores a la derecha
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // Insertar el elemento en su posición correcta
            arr[j + 1] = key;
        }
    }

    /**
     * Imprime los elementos de un arreglo en una línea.
     */
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    /**
     * Punto de entrada del programa.
     */
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };

        Ejercicio08_InsertionSort_ ob = new Ejercicio08_InsertionSort_();
        ob.sort(arr);

        System.out.println("Arreglo ordenado:");
        printArray(arr);
    }
}
