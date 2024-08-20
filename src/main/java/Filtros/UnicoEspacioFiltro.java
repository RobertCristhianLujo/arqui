/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filtros;

/**
 *
 * @author carja
 */
public class UnicoEspacioFiltro implements FiltroInterface{

    @Override
    public Object accionarFiltro(Object entrada) {
        System.out.println("==> UnicoEspacioFiltro = Todas las palabras colocarlas en un vector");
        if (entrada instanceof String) {
            String frase = (String) entrada; 
            return frase.replaceAll("\\s+", " ").trim();
        }
        throw new IllegalArgumentException("La entrada deberia ser un string");
    }
}
