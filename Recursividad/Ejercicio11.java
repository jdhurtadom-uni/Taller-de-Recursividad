/**
 * EJERCICIO 11: Leer n valores enteros, almacenarlos en un arreglo y sumar sus elementos.
 Complejidad: O(m)
 */
public class Ejercicio11_SumaArreglo {

    /**
     * Método principal para sumar los elementos de un arreglo.
     * * @param arreglo El vector con los números a sumar.
     * @return La suma total de los elementos.
     */
    public static int sumarArreglo(int[] arreglo) {
        return sumarArregloAuxiliar(arreglo, 0);
    }

    /**
     * Método recursivo auxiliar que recorre el arreglo usando un índice.
     */
    private static int sumarArregloAuxiliar(int[] arreglo, int indice) {
        // Caso base: Si el índice alcanza la longitud del arreglo, terminamos de recorrerlo.
        if (indice == arreglo.length) {
            return 0;
        }
        // Aplicacion de recursividad se suma el elemento actual y avanzamos al siguiente índice.
        return arreglo[indice] + sumarArregloAuxiliar(arreglo, indice + 1);
    }

    public static void main(String[] args) {
        // Simulamos la lectura de n valores ya almacenados en el arreglo
        int[] miArreglo = {5, 10, 15, 20}; 
        int total = sumarArreglo(miArreglo);
        
        System.out.println("La suma de los elementos del arreglo es: " + total);
    }
}
