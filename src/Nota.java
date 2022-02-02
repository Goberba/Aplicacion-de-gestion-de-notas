
public class Nota {
	private int evaluacion;
	private String modulo;
	private double nota;
	
	public Nota(int e, String m, double n) {
		this.evaluacion=e;
		this.modulo=m;
		this.nota=n;
	}
	public String toString() {
		return "Nota "+this.nota+" de la evaluación "+this.evaluacion+" en el módulo "+this.modulo;
	}
	public String getModulo() {
		return modulo;
	}
	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	

}
