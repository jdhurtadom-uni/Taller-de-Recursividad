/**
 * EJERCICIO 7: Calcular la potencia elevando la base al exponente.
 complejidad: O(e)
 */
public class Ejercicio07_Potencia {

    /**
     * Calcula la potencia de un número elevando una base a un exponente dado.
     * * @param base El número que será multiplicado.
     * @param exponente La cantidad de veces que se multiplicará la base.
     * @return El resultado de la operación de potenciación.
     */
    public static int calcularPotencia(int base, int exponente) {
        // Caso base: Cualquier base elevada a la potencia 0 es 1.
        if (exponente == 0) {
            return 1;
        }
        // Caso recursivo: Se multiplica la base por la función disminuyendo el exponente.
        return base * calcularPotencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        int basePrueba = 2;
        int exponentePrueba = 3;
        int resultado = calcularPotencia(basePrueba, exponentePrueba);
        System.out.println(basePrueba + " elevado a " + exponentePrueba + " es: " + resultado);
    }
}
