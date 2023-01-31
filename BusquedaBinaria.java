/*
 * BUSQUEDAS:
 * A partir de una lista ordenada de 20 números realiza un programa que llame a 
 * dos funciones que realizan dos tipos de búsqueda y muestre el número de pasos 
 * que se realizan en cada una de ellas para dar con el elemento a buscar.
 * - Búsqueda secuencial: los elementos de la lista se van examinando secuencialmente, 
 *   uno detrás de otro, hasta que se encuentra el elemento buscado.
 * - Búsqueda binaria: se situa la búsqueda en el centro de la lista. Si el elemento 
 *   buscado no coincide con el elemento central, se comprueba si éste se encontraría 
 *   en la mitad inferior o superior, y se repite la búsqueda del centro de esta sublista 
 * hasta dar con el elemento a buscar.
 */
package estructurasestaticas;

import java.util.Scanner;

/**
 * Programa que realiza una búsqueda binaria y secuencial
 *
 */
public class BusquedaBinaria {
    /**
     * Método que realiza una búsqueda secuencial
     *
     * @param a: array de elementos
     * @param clave: elemento a buscar
     * @return Devuelve el número de pasos realizados en la búsqueda
     */
    public static int busquedaSecuencial(int a[], int clave) {
        int i = 0, aux;
        boolean encontrado = false;

        //Mientras no lleguemos al final del array ni encontremos el elemento
        while (i < a.length - 1 && a[i] != clave) {
            i++;//Avanzamos
        }
        //Hay que sumar 1 para que considere la primera posición
        return i+1; //Devuelve el número de pasos que ha realizado (el índice encontrado o la longitud de la lista)
    }
    /**
     * Método que realiza una búsqueda binaria
     *
     * @param a: array de elementos
     * @param clave: elemento a buscar
     * @return Devuelve el número de pasos realizados en la búsqueda
     */
    public static int busquedaBinaria(int a[], int clave) {
        int central, bajo, alto, valorCentral, posicion,contador;
        contador = 1;//Número de pasos que realizamos en la búsqueda
        bajo = 0; //Partimos de que el índice más bajo es 0
        alto = a.length - 1; //Partimos de que el índice más alto es el tamaño del array
        while (bajo <= alto) {
            central = (bajo + alto) / 2;   // Índice de elemento central 
            valorCentral = a[central];   // Valor del índice central 
            if (clave == valorCentral) {//Si encuentra el valor, devuelve el número de pasos
                return contador;
            } else if (clave < valorCentral) { //Si el valor buscado es menor buscamos en la lista inferior
                alto = central - 1;
            } else {
                bajo = central + 1; //Si el valor buscado es mayor, buscamos en la lista superior
            }
            contador++;
        }
        return contador;
    }

    /**
     * Método main
     *
     * @param args Argumentos de la llamada al método main
     */
    public static void main(String[] args) {
        //Creamos un array de elementos desordenados (pueden solicitarse al usuario)
        int[] array = {1, 3, 4, 6, 8, 10, 11, 12, 15, 16, 17, 19, 21, 24, 26, 29, 30, 31, 33, 39};
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un elemento a buscar");
        int valorBuscado = sc.nextInt();

        //Ejecutamos la búsqueda secuencial
        System.out.println("La búsqueda secuencial ha realizado "+busquedaSecuencial(array,valorBuscado)+" pasos");
        System.out.println("La búsqueda binaria ha realizado "+busquedaBinaria(array,valorBuscado)+" pasos");
    }
}
