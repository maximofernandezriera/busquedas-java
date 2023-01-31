# busquedas-java
Un ejercicio de búsquedas para Java.

 A partir de una lista ordenada de 20 números realiza un programa que llame a dos funciones que realizen dos tipos de búsqueda y muestre el número de pasos (bucles) que se realizan en cada una de ellas para dar con el elemento a buscar.
 
 - Búsqueda secuencial: los elementos de la lista se van examinando secuencialmente, uno detrás de otro, hasta que se encuentra el elemento buscado.
 
 - Búsqueda binaria: se situa la búsqueda en el centro de la lista. Si el elemento buscado no coincide con el elemento central, se comprueba si éste se encontraría en la mitad inferior o superior, y se repite la búsqueda del centro de esta sublista hasta dar con el elemento a buscar.

NOTA: Los elementos pueden directamente establecidos en el código, por ejemplo:

      int[] array = {1, 3, 4, 6, 8, 10, 11, 12, 15, 16, 17, 19, 21, 24, 26, 29, 30, 31, 33, 39};

Y el elemento a buscar debe ser introducido por el usuario, por ejemplo:.

       Scanner sc = new Scanner(System.in);
       System.out.println("Introduzca un elemento a buscar");
       int valorBuscado = sc.nextInt();

