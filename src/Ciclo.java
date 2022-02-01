
public class Ciclo {
	private String identificadorGrupo;
	private String nomCiclo;
	private int duracionHoras;
	private int tamCiclo;
	
	public Ciclo(String i, String n, int horas, int t) {
		this.identificadorGrupo=i;
		this.nomCiclo=n;
		this.duracionHoras=horas;
		this.tamCiclo=t;
	}

	public int getTamCiclo() {
		return tamCiclo;
	}

	public void setTamCiclo(int tamCiclo) {
		this.tamCiclo = tamCiclo;
	}
	
}
