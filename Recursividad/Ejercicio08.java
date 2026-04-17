/**
 * EJERCICIO 8: Calcular el Máximo Común Divisor (M.C.D.) utilizando el algoritmo de Euclides.
 complejidad O(log(min(m,n)))
 */
public class Ejercicio08_MCD {

    /**
     * Calcula el M.C.D. de dos números.
     * * @param numeroM El primer número entero.
     * @param numeroN El segundo número entero.
     * @return El máximo común divisor de ambos números.
     */
    public static int calcularMcd(int numeroM, int numeroN) {
        // Caso base: Si el segundo número es 0, el M.C.D. es el primer número.
        if (numeroN == 0) {
            return numeroM;
        }
        // Aplicacion de recursividad se intercambian los valores y se calcula el residuo.
        return calcularMcd(numeroN, numeroM % numeroN);
    }

    public static void main(String[] args) {
        int numero1 = 48;
        int numero2 = 18;
        int resultado = calcularMcd(numero1, numero2);
        System.out.println("El M.C.D. de " + numero1 + " y " + numero2 + " es: " + resultado);
    }
}
