/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filtros;

import java.util.Arrays;

/**
 *
 * @author carja
 */
public class OrdenarVectorFiltro implements FiltroInterface{
    
    @Override
    public Object accionarFiltro(Object entrada) {
        System.out.println("==> OrdenarVectorFiltro = Ordenar el vector");
        if (entrada instanceof String[]) {
            String[] arrayString = (String[]) entrada; 
            return bubbleSort(arrayString);
        }
        throw new IllegalArgumentException("La entrada deberia un array de strings String[]");
    }
    
   /**
     * Ordena un array de palabras alfabéticamente usando el algoritmo de burbuja
     * sin considerar las diferencias entre mayúsculas y minúsculas, y lo retorna.
     *
     * @param words El array de palabras a ordenar.
     * @return El array ordenado.
     */
    public static String[] bubbleSort(String[] words) {
        int n = words.length;
        boolean swapped;

        // Recorre el array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Compara y cambia elementos adyacentes si están en el orden incorrecto
            for (int j = 0; j < n - i - 1; j++) {
                if (words[j].compareToIgnoreCase(words[j + 1]) > 0) {
                    // Intercambia words[j] y words[j + 1]
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                    swapped = true;
                }
            }

            // Si no se hicieron intercambios, el array ya está ordenado
            if (!swapped) break;
        }

        return words;
    }
}
