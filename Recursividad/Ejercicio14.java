/**
 * EJERCICIO 14: Función de Ackermann.
 */
public class Ejercicio14{

    /**
     * Calcula el valor de la función de Ackermann para dos valores enteros m y n.
     * * @param m Primer valor entero (debe ser mayor o igual a 0).
     * @param n Segundo valor entero (debe ser mayor o igual a 0).
     * @return El resultado de la evaluación recursiva.
     */
    public static int ackermann(int m, int n) {
        // Caso base: Si m = 0
        if (m == 0) {
            return n + 1;
        }
        // Caso recursivo 1: Si m > 0 y n = 0
        else if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        }
        // Caso recursivo 2: Si m > 0 y n > 0
        else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }

    public static void main(String[] args) {
        // Casos de prueba provistos en el enunciado
        int resultado1 = ackermann(1, 2);
        int resultado2 = ackermann(3, 2);
        
        System.out.println("Ackermann(1, 2) = " + resultado1); // Debe dar 4
        System.out.println("Ackermann(3, 2) = " + resultado2); // Debe dar 29
    }
}