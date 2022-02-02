
import java.util.Date;

public class Alumno {
    private String DNI;
    private String nombre;
    private String fecha;
    private Ciclo ciclo;
    private Nota nota;
    
    public Alumno(String dni, String nom, String fecha, Ciclo c, Nota n) {
        this.DNI=dni;
        this.nombre=nom;
        this.fecha=fecha;
        this.ciclo=c;
        this.nota=n;
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

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}
    
}
