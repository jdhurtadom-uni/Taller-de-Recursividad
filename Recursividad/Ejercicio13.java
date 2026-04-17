/**
 * EJERCICIO 13: Imprimir la serie de Fibonacci hasta un valor límite n.
 Complejidad: O(^n)
 */
public class Ejercicio13_Fibonacci {

    /**
     * Calcula el valor de la serie de Fibonacci en una posición específica.
     * * @param n La posición en la serie.
     * @return El valor de Fibonacci en la posición n.
     */
    public static int calcularFibonacci(int n) {
        // Casos base: Definidos explícitamente en el enunciado.
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        //Aplicacion de recursividad de la suma de los dos términos anteriores.
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int limite = 10; // Límite de términos a imprimir
        
        System.out.println("Serie de Fibonacci hasta el límite " + limite + ":");
        // Imprimimos la serie calculando cada término desde 0 hasta el límite
        for (int i = 0; i < limite; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
    }
}
