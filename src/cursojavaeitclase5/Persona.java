package cursojavaeitclase5;

import java.util.Objects;

public class Persona implements Comparable<Persona> {

    private String dni;
    private String nombre;

    public Persona(String nombre, String dni) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona:{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    public int compareTo(Persona otra) {
        return this.dni.compareTo(otra.dni);

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
