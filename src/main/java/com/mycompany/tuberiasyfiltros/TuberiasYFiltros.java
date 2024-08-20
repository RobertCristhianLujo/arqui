/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tuberiasyfiltros;

import Filtros.ConvertirAVectorFiltro;
import Filtros.OrdenarVectorFiltro;
import Filtros.ConvertirAStringFiltro;
import Filtros.UnicoEspacioFiltro;
import Tuberia.Tuberia;

/**
 *
 * @author carja
 */
public class TuberiasYFiltros {

    public static void main(String[] args) {
        
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Escribi tu nombre ");
//        String input = scanner.nextLine();
        String input = "Banana Ciruela Anana durazno   Manzana Pera Uva gtra aosa zuela";
        System.out.println("INPUT =>> " + input);
        Tuberia tuberiaInstancia = new Tuberia();
        tuberiaInstancia.anadirFiltro(new UnicoEspacioFiltro());
        tuberiaInstancia.anadirFiltro(new ConvertirAVectorFiltro());
        tuberiaInstancia.anadirFiltro(new OrdenarVectorFiltro());
        // un filtro que te quite las palabras que empiecen con la letra C
        tuberiaInstancia.anadirFiltro(new ConvertirAStringFiltro());
        
        System.out.println(tuberiaInstancia.Filtrar(input));
//        String[] salida = (String[]) tuberiaInstancia.Filtrar(input);
//        String mostrar = "[ ";
//        for (int i = 0; i < salida.length; i++) {
//            mostrar = mostrar + salida[i];
//            if (i < salida.length - 1) {
//                mostrar = mostrar + " | ";
//            }
//        }
//        
//        System.out.println(mostrar + " ]");
    }
}
