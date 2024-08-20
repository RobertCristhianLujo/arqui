/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuberia;

import Filtros.FiltroInterface;
import java.util.*;

/**
 *
 * @author carja
 */
public class Tuberia {
    
    private final List<FiltroInterface> filtros = new ArrayList<>();

    // Añadir filtros a la tubería
    public void anadirFiltro(FiltroInterface filter) {
        filtros.add(filter);
    }

    // Procesar datos a través de la tubería
    public Object Filtrar(String input) {
        Object result = input;
        for (FiltroInterface filter : filtros) {
            result = filter.accionarFiltro(result);
        }
        return result;
    }
}
