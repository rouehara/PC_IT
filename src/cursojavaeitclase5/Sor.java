/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaeitclase5;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author educacionit
 */
public class Sor {

    public static void main(String[] args) {

        // int compareto(  obj) LA CLASE PERSONA IMPLENTE COMPARBLE
        SortedSet<Persona> personas = new TreeSet<Persona>();
        personas.add(new Persona("Juan", "20"));
        personas.add(new Persona("Pedro", "10"));
        personas.add(new Persona("Alumno", "30"));
        personas.add(new Persona("xxxxx", "40"));

        for (Persona p : personas) {
            System.out.println(p);
        }
        /*
        Conviert un string en entero  
        try{
            int numEntero = Integer.parseInt( valor en string );
        }catch(NumberFormatException e){
          
        }
ejemplo 
    *************************************************
    
    for(int i = 0; i < worlds.jTextArea1.getLineCount(); i++){
   if(Integer.parseInt(worlds.jTextArea1.getText(worlds.jTextArea1.getLineStartOffset(i),worlds.jTextArea1.getLineEndOffset(i)) != (null))){}
 }    
        
        public static boolean isParsable(String input){
    boolean parsable = true;
    try{
        Integer.parseInt(input);
    }catch(NumberFormatException e){
        parsable = false;
    }
    return parsable;
}
    **************************************************    
    Check if it is integer parseable

public boolean isInteger(String string) {
    try {
        Integer.valueOf(string);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
        
or use Scanner

Scanner scanner = new Scanner("Test string: 12.3 dog 12345 cat 1.2E-3");

while (scanner.hasNext()) {
    if (scanner.hasNextDouble()) {
        Double doubleValue = scanner.nextDouble();
    } else {
        String stringValue = scanner.next();
    }
}
or use Regular Expression like

private static Pattern doublePattern = Pattern.compile("-?\\d+(\\.\\d*)?");

public boolean isDouble(String string) {
    return doublePattern.matcher(string).matches();
}
  ******************************************************      
        
 */

    }

}
