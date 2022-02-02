
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

	public void verNotayAlumno() {
		System.out.println("El alumno "+this.nombre+", tiene como nota "+nota.getNota()+".");
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}
	
	public void verNotayModulo() {
		System.out.println("Modulo: "+this.nota.getModulo()+". Con la nota: "+this.nota.getNota());
	}
	public void cambiarNota(double cambioNota) {
		this.nota.setNota(cambioNota);
		System.out.println("Ahora la nota del alumno "+this.nombre+" es "+this.nota.getNota());
	}
    
}
