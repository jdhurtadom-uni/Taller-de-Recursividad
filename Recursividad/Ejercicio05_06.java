/**
 * EJERCICIOS 5 Y 6: Sumar los dígitos de un número (Ej: 123 -> 6).
 */
public class Ejercicio05_06 {

    /**
     * Suma todos los dígitos individuales que componen un número entero.
     * * @param numero El número cuyos dígitos se van a sumar.
     * @return La suma total de los dígitos.
     */
    public static int sumarDigitos(int numero) {
        // Caso base: Si el número es 0, no hay más dígitos que sumar.
        if (numero == 0) {
            return 0;
        }
        
        // Aplicacion de recursividad Se extrae el último dígito y se suma al procesamiento del resto.
        int ultimoDigito = numero % 10;
        int restoDelNumero = numero / 10;
        
        return ultimoDigito + sumarDigitos(restoDelNumero);
    }

    public static void main(String[] args) {
        int numeroPrueba = 123;
        int resultado = sumarDigitos(numeroPrueba);
        System.out.println("La suma de los dígitos de " + numeroPrueba + " es: " + resultado);
    }
}