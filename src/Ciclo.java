
public class Ciclo {
	private String identificadorGrupo;
	private String nomCiclo;
	private int tamCiclo;
	
	public Ciclo(String i, String n) {
		this.identificadorGrupo=i;
		this.nomCiclo=n;
	}

	public int getTamCiclo() {
		return tamCiclo;
	}

	public void setTamCiclo(int tamCiclo) {
		this.tamCiclo = tamCiclo;
	}
	
}
