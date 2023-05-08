import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Carrera carrera1 = new Carrera("Ingeniería en Sistemas Computacionales", 4);
        Carrera carrera2 = new Carrera("Licenciatura en Administración", 3);
        Carrera carrera3 = new Carrera("Licenciatura en Diseño Gráfico", 4);
        Carrera carrera4 = new Carrera("Licenciatura en Marketing", 5);
        Carrera carrera5 = new Carrera("Informática", 6);
        
        List<Carrera> carreras = new ArrayList<>();
        carreras.add(carrera1);
        carreras.add(carrera2);
        carreras.add(carrera3);
        
        Universidad universidad = new Universidad("Universidad Ejemplo", carreras);
        
        universidad.imprimirCarreras();
        
        System.out.println();
        
        carrera1.imprimirDatos();
        carrera2.imprimirDatos();
        carrera3.imprimirDatos();
    }
}
