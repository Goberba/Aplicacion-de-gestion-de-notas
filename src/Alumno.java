
import java.util.Date;

public class Alumno {
    private String DNI;
    private String nombre;
    private String fecha;
    private Ciclo ciclo;
    private Nota nota;
    
    public Alumno(String dni, String nom, String fecha, Ciclo c) {
        this.DNI=dni;
        this.nombre=nom;
        this.fecha=fecha;
        this.ciclo=c;
    }
    
    public String toString() {
        return ("DNI: "+this.DNI+",  Nombre: "+this.nombre+",  Fecha de nacimiento: "+
        		this.fecha+",  Ciclo: "+this.ciclo+", "+this.nota.toString());
    }
    
        public Ciclo getCiclo() {
		return ciclo;
	}

	public void setCiclo(Ciclo ciclo) {
		this.ciclo = ciclo;
	}
    
}
