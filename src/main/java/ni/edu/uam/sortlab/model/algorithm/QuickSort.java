package ni.edu.uam.sortlab.model.algorithm;

/**
 * Implementacion de QuickSort para ordenar arreglos de enteros de forma ascendente.
 * El ordenamiento se realiza sobre el arreglo recibido, sin crear una copia.
 */
public final class QuickSort {

    private QuickSort() {
        // Clase utilitaria: no necesita instancias.
    }

    /**
     * Ordena un arreglo de menor a mayor mediante QuickSort.
     *
     * @param arreglo arreglo que se desea ordenar
     * @throws IllegalArgumentException si el arreglo es null
     */
    public static void sort(int[] arreglo) {
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser null");
        }
        quickSort(arreglo, 0, arreglo.length - 1);
    }

    private static void quickSort(int[] arreglo, int izquierda, int derecha) {
        if (izquierda >= derecha) {
            return;
        }

        int i = izquierda;
        int j = derecha;
        int pivote = arreglo[izquierda + (derecha - izquierda) / 2];

        while (i <= j) {
            while (arreglo[i] < pivote) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }
            if (i <= j) {
                int temporal = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temporal;
                i++;
                j--;
            }
        }

        if (izquierda < j) {
            quickSort(arreglo, izquierda, j);
        }
        if (i < derecha) {
            quickSort(arreglo, i, derecha);
        }
    }
}
