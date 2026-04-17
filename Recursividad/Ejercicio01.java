/**
 * EJERCICIO 1: Calcular el factorial de un número.
 */
public class Ejercicio01 {

    /**
     * Calcula el factorial de un número entero positivo aplicando recursividad
     * * @param numero El número el cual se va calcular el factorial 
     * @return nos dara el resultado factorial
     */
    public static int calcularFactorial(int numero) {
        //El factorial de 0 o 1 es siempre 1.
        if (numero <= 1) {
            return 1; 
        }
        //aplicacion de recursividad se multiplica el número actual por el factorial del número anterior.
        return numero * calcularFactorial(numero - 1);
    }
     

    public static void main(String[] args) {
        int numeroPrueba = 5;
        int resultado = calcularFactorial(numeroPrueba);
        System.out.println("El factorial de " + numeroPrueba + " es: " + resultado);
    }
}