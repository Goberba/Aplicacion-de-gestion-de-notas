
import java.util.Date;

public class Alumno {
    private String DNI;
    private String nombre;
    private Date fecha;
    private Ciclo ciclo;
    private Nota[] nota;
    
    public Alumno(String dni, String nom, Date fecha, Ciclo c, Nota[] n) {
        this.DNI=dni;
        this.nombre=nom;
        this.fecha=fecha;
        this.ciclo=c;
        this.nota=n; 
    }
    
    public String toString() {
        return ("DNI: "+this.DNI+",  Nombre: "+this.nombre+",  Fecha de nacimiento: "+
        		this.fecha+",  Ciclo: "+this.ciclo+",  Nota: "+this.nota);
    }
    
    
    
}
