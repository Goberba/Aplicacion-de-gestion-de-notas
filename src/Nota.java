
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
		return "Nota "+this.nota+" de la evaluaci�n "+this.evaluacion+" en el m�dulo "+this.modulo;
	}

}
