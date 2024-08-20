/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filtros;

/**
 *
 * @author valeria
 * Este filtro es solo para mostrar en pantalla el array
 */
public class ConvertirAStringFiltro implements FiltroInterface{

    @Override
    public Object accionarFiltro(Object entrada) {
        System.out.println("==> Convertir string a filtro");
        if (entrada instanceof String[]) {  
            String[] arrayString = (String[]) entrada; 
            String mostrar = "[ ";
            for (int i = 0; i < arrayString.length; i++) {
                mostrar = mostrar + arrayString[i];
                if (i < arrayString.length - 1) {
                    mostrar = mostrar + " | ";
                }
            }
        
        return mostrar + "]";
        }
        throw new IllegalArgumentException("La entrada deberia un array de strings String[]");
    }
    
}
