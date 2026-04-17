/**
 * EJERCICIO 12: Crear una matriz de tamaño mXn y sumar sus elementos.
 Complejidad O(fxc)
 */
public class Ejercicio12_SumaMatriz {

    /**
     * Método principal para iniciar la suma de la matriz.
     * * @param matriz La matriz bidimensional de enteros.
     * @return La suma de todos los elementos.
     */
    public static int sumarMatriz(int[][] matriz) {
        return sumarMatrizAuxiliar(matriz, 0, 0);
    }

    /**
     * Método recursivo auxiliar para recorrer filas y columnas.
     */
    private static int sumarMatrizAuxiliar(int[][] matriz, int fila, int columna) {
        // Caso base 1: Si hemos procesado todas las filas, terminamos.
        if (fila == matriz.length) {
            return 0;
        }
        
        // Caso base 2 (salto de línea): Si la columna llega al final de la fila actual, 
        // pasamos a la siguiente fila, reiniciando la columna a 0.
        if (columna == matriz[fila].length) {
            return sumarMatrizAuxiliar(matriz, fila + 1, 0);
        }
        
        // Aplicacion de recursividad se suma la celda actual se continua a la siguiente columna.
        return matriz[fila][columna] + sumarMatrizAuxiliar(matriz, fila, columna + 1);
    }

    public static void main(String[] args) {
        int[][] miMatriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int total = sumarMatriz(miMatriz);
        System.out.println("La suma de los elementos de la matriz es: " + total);
    }
}
