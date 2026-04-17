/**
 * EJERCICIO 4: Invertir un número entero (Ej: 123 -> 321).
  Complejidad: O(log10^n)
 */
public class Ejercicio04 {

    /**
     * Método principal para invertir el orden de los dígitos de un número entero.
     * * @param numero El número original el cual se va a invertir.
     * @return El número con sus dígitos en orden inverso.
     */
    public static int invertirNumero(int numero) {
        return invertirNumeroAuxiliar(numero, 0);
    }

    /**
     * Método recursivo auxiliar que arrastra el estado del número invertido.
     */
    private static int invertirNumeroAuxiliar(int numeroRestante, int numeroInvertido) {
        // Caso base: Cuando el número original se reduce a 0, retornamos el acumulador.
        if (numeroRestante == 0) {
            return numeroInvertido;
        }
        
        // Aplicacion de recursividad se extrae el último dígito y lo añadimos al acumulador desplazado.
        int ultimoDigito = numeroRestante % 10;
        int nuevoInvertido = (numeroInvertido * 10) + ultimoDigito;
        
        return invertirNumeroAuxiliar(numeroRestante / 10, nuevoInvertido);
    }

    public static void main(String[] args) {
        int numeroPrueba = 12345;
        int resultado = invertirNumero(numeroPrueba);
        System.out.println("El número " + numeroPrueba + " invertido es: " + resultado);
    }
}
