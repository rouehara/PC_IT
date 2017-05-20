/*
codingbat.com
https://www.viinacademy.com
BUILD SYSTEM Apache mavem
Libros head first Patrones de diseño
Gang of four

Sobreescribo el metodo equals con los parámetros que yo quiero que compare.
public boolean equals (Object o){
    Persona p = (Persona) o;
    return this.dni.equals(p.dni)
}

Hashcode le asigna un codigo al parametro que deseo (No me asegura que sea unico):
public int hashcode(){
    return this.dni.hashcode()
}

Collection<T>->List<T>
             ->Set<T>->SortedSet<T>
             ->Queue<T>

Maps->SortedMap
Clave/Valor 

List<String> nombres = new ArrayList<>();   / new LinkedList<>()
nombres.add("Juan");
nombres.add("Pedro");
nombres.add("Juan");
System.out.println(nombres.size())




 */
package cursojavaeitclase5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CursoJavaEITClase5 {

    public static void main(String[] args) {
        /*List<String> nombres = new ArrayList<>();   // new LinkedList<>()
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Arribas");
        System.out.println(nombres.size());
        System.out.println(nombres.get(0));
        nombres.remove(0);
        for(String e : nombres){                      //for each
            System.out.println(e);            
        }
        System.out.println(nombres.indexOf("Arribas"));*/
        Set <Persona> personas = new HashSet<>();
        personas.add(new Persona("Juan", "10"));
        personas.add(new Persona("Juan", "10"));
        personas.add(new Persona("Pedro", "10"));
        personas.add(new Persona("Omar", "10"));
        System.out.println(personas.size());
        
       
        

    }
    
}
