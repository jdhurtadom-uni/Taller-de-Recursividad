/**
 * EJERCICIO 9: Calcular el cociente de la división entera mediante restas sucesivas.
 complejidad: O(q)
 */
public class Ejercicio09_DivisionRestas {

    /**
     * Calcula el cociente de una división entera utilizando únicamente restas.
     * * @param dividendo El número a dividir.
     * @param divisor El número por el cual se divide.
     * @return El cociente entero de la división.
     */
    public static int calcularDivisionPorRestas(int dividendo, int divisor) {
        // Caso base: Si el dividendo es menor que el divisor, ya no se puede restar más.
        if (dividendo < divisor) {
            return 0;
        }
        // Caso recursivo: Se cuenta "1" resta exitosa y se pasa el nuevo dividendo reducido.
        return 1 + calcularDivisionPorRestas(dividendo - divisor, divisor);
    }

    public static void main(String[] args) {
        int dividendoPrueba = 20;
        int divisorPrueba = 4;
        int resultado = calcularDivisionPorRestas(dividendoPrueba, divisorPrueba);
        System.out.println(dividendoPrueba + " dividido entre " + divisorPrueba + " es: " + resultado);
    }
}
