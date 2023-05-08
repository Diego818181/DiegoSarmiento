import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Carrera> carreras;
    
    public Universidad(String nombre, List<Carrera> carreras) {
        this.nombre = nombre;
        this.carreras = carreras;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List<Carrera> getCarreras() {
        return carreras;
    }
    
    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }
    
    public void imprimirCarreras() {
        System.out.println("Carreras de la Universidad " + nombre + ":");
        for (Carrera carrera : carreras) {
            System.out.println("- " + carrera.getNombre());
        }
    }
}