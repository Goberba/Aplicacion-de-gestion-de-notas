
public class Ciclo {
	private String identificadorGrupo;
	private String nomCiclo;
	private int duracionHoras;
	
	public Ciclo(String i, String n, int horas) {
		this.identificadorGrupo=i;
		this.nomCiclo=n;
		this.duracionHoras=horas;
	}

	public String getIdentificadorGrupo() {
		return identificadorGrupo;
	}

	public void setIdentificadorGrupo(String identificadorGrupo) {
		this.identificadorGrupo = identificadorGrupo;
	}

	public String getNomCiclo() {
		return nomCiclo;
	}

	public void setNomCiclo(String nomCiclo) {
		this.nomCiclo = nomCiclo;
	}

	public int getDuracionHoras() {
		return duracionHoras;
	}

	public void setDuracionHoras(int duracionHoras) {
		this.duracionHoras = duracionHoras;
	}
	
	

}
