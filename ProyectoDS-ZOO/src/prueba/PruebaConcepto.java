/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import clases.Continente;
import clases.Cuidador;
import clases.CuidadorEspecie;
import clases.Especie;
import clases.Guia;
import clases.Habitat;
import clases.Itinerario;
import clases.Zona;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kingu
 */
public class PruebaConcepto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Continente continente=new Continente("Africa");
        List<Continente> continentes=new ArrayList<>();
        continentes.add(continente);
        Habitat habitat=new Habitat("Desierto", "Cálido", "gramíneas perennes", continentes);
        Zona zona=new Zona("Sabana", 2500);
        List<Itinerario> itinerarios=new ArrayList<>();
        Guia guia=new Guia(itinerarios, "Abraham", "Melchor Ocampo", "6471266682", new Date(123, 1, 28));
        List<Zona> zonas=new ArrayList<>();
        zonas.add(zona);
        Itinerario itinerario=new Itinerario(20, 300, 2000, 20, guia, zonas);
        Itinerario itinerario2=new Itinerario(15, 180, 2000, 15, guia, zonas);
        itinerarios.add(itinerario);
        itinerarios.add(itinerario2);
        guia.setItinerarios(itinerarios);
        List<Habitat> habitats=new ArrayList<>();
        habitats.add(habitat);
        List<CuidadorEspecie> cuidadoresEspecie=new ArrayList<>();
        Especie especie=new Especie("Gacela", "Gazella", "Son antílopes de tamaño medio, ágiles y de patas largas", habitats, zona, cuidadoresEspecie);
        Cuidador cuidador=new Cuidador(especie, cuidadoresEspecie, "Alexa", "Huatabampo", "6471254321", new Date(122, 10, 20));
        CuidadorEspecie cuidadorEspecie=new CuidadorEspecie(true, new Date(122, 10, 20), cuidador, especie);
        cuidadoresEspecie.add(cuidadorEspecie);
        especie.setCuidadores(cuidadoresEspecie);
        cuidador.setEspecies(cuidadoresEspecie);
    }
    
}
