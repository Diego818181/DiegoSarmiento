import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private String nombre;
    private int duracion;
    
    public Carrera(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public void imprimirDatos() {
        System.out.println("Nombre de la carrera: " + nombre);
        System.out.println("Duración de la carrera: " + duracion + " años");
    }
}