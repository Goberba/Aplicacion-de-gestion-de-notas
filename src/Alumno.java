
import java.util.Date;

public class Alumno {
    private String DNI;
    private String nombre;
    private Date fecha;
    
    public Alumno(String dni, String nom, Date fecha) {
        this.DNI=dni;
        this.nombre=nom;
        this.fecha=fecha;
    }
    
    public void meterAlumno() {
        
    }
    public void borrarAlumno() {
        
    }
    public String toString() {
        return this.DNI;
    }
    
    
    
}
