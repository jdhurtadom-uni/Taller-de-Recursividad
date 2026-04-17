/**
 * EJERCICIO 10: Realizar la multiplicación de 2 números mediante sumas sucesivas.
 Complejidad O(m)
 */
public class Ejercicio10_MultiplicacionSumas {

    /**
     * Realiza la multiplicación de dos números enteros mediante sumas.
     * * @param multiplicando El número que se va a sumar repetidamente.
     * @param multiplicador La cantidad de veces que se debe sumar.
     * @return El producto de la multiplicación.
     */
    public static int multiplicarPorSumas(int multiplicando, int multiplicador) {
        // Caso base: Si el multiplicador llega a 0, el resultado de la suma es 0.
        if (multiplicador == 0) {
            return 0;
        }
        // Aplicacion de recursividad se suma el multiplicando y se disminuye el multiplicador en 1.
        return multiplicando + multiplicarPorSumas(multiplicando, multiplicador - 1);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 4;
        int resultado = multiplicarPorSumas(num1, num2);
        System.out.println(num1 + " multiplicado por " + num2 + " es: " + resultado);
    }
}
