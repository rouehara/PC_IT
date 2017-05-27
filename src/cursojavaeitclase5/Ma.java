/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaeitclase5;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author educacionit
 */
public class Ma {

    public static void main(String[] args) {

        Map<String, Persona> personaDni = new HashMap<>();

        personaDni.put("10", new Persona("Juam", "10"));
        personaDni.put("50", new Persona("Juam", "50"));
        Persona p2 = new Persona("pedro", "30");

        personaDni.put(p2.getDni(), p2);

        personaDni.put("10", p2);

        Persona x = personaDni.get("20");

        for (Persona p : personaDni.values()) {
            System.out.println(p);
        }

        for (String k : personaDni.keySet()) {

            System.out.println(k + ":" + personaDni.get(k));

        }
        //OTRA FORMA

        for (Map.Entry<String, Persona> e : personaDni.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());

        }

        personaDni.containsKey("20");  // Método que comprueba si una clave está dada de alta en el mapa.
        personaDni.containsValue(p2);

        // el metodo get devuelve un valor 
        Persona x1 = personaDni.getOrDefault("30", new Persona("30", "Jorge"));
//  retorna un valor por defecto en el caso de no existir

// borrar 
        personaDni.remove("20");

        personaDni.putIfAbsent("40", p2); // retorna el valor agregado si existe me devuelve el valor que habia

        for (Persona p : personaDni.values()) {
            System.out.println(p);
        }

    }
}
//https://jarroba.com/map-en-java-con-ejemplos/
//http://dis.um.es/docencia/poo/wiki/lib/exe/fetch.php?media=curso2015:tema6.pdf
