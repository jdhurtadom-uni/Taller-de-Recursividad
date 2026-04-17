/**
 * EJERCICIO 3: Calcular la sumatoria 1 + 1/2 + 1/3 + ... + 1/n
  Complejidad: O(n)
 */
public class Ejercicio03 {

    /**
     * Calcula la suma de la serie de fracciones 1/n de forma recursiva.
     * * @param denominador este va a ser el número máximo que alcanzará el denominador en la serie.
     * @return El resultado decimal de la suma de las fracciones.
     */
    public static double calcularSumatoriaFracciones(int denominador) {
        // Caso base: Si el denominador es 1, la fracción es 1/1, por lo que retorna 1.0.
        if (denominador == 1) {
            return 1.0;
        }
        // Aplicacion de recursividad se calcula 1/n y se suma al resultado de la función con n-1.
        return (1.0 / denominador) + calcularSumatoriaFracciones(denominador - 1);
    }

    public static void main(String[] args) {
        int numeroPrueba = 5;
        double resultado = calcularSumatoriaFracciones(numeroPrueba);
        System.out.println("La sumatoria de fracciones hasta 1/" + numeroPrueba + " es: " + resultado);
    }
}
