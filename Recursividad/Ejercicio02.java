/**
 * EJERCICIO 2: Calcular la sumatoria hasta el número leído.
  Complejidad: O(n)
 */
public class Ejercicio02{

    /**
     * Calcula la sumatoria de todos los números enteros desde 1 hasta el límite.
     * * @param limite Este va a se el numero entero hasta donde se desea sumar.
     * @return El resultado final va a ser el total de la sumatoria.
     */
    public static int calcularSumatoria(int limite) {
        // Caso base: Si el número llega a 0, la suma termina.
        if (limite == 0) {
            return 0;
        }
        // Aplicacion de recursividad se suma el número actual con la sumatoria del número anterior.
        return limite + calcularSumatoria(limite - 1);
    }

    public static void main(String[] args) {
        int numeroPrueba = 5;
        int resultado = calcularSumatoria(numeroPrueba);
        System.out.println("La sumatoria hasta " + numeroPrueba + " es: " + resultado);
    }
}
