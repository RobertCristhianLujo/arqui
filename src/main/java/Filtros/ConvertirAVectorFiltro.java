/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filtros;

/**
 *
 * @author carja
 */
public class ConvertirAVectorFiltro implements FiltroInterface{
    
    @Override
    public Object accionarFiltro(Object entrada) {
        System.out.println("==> UnicoEspacioFiltro = revisar que entre una palabra y otra solo exista un espacio, sino eliminar");
        if (entrada instanceof String) {    
            String frase = (String) entrada; 
            return frase.split(" ");
        }
        throw new IllegalArgumentException("La entrada deberia ser un string");
    }
}
