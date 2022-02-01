
public class Aplicacion {

	public static void main(String[] args) {


	}
	
	public void meterAlumno(Alumno a) {
		Alumno[] alumnos=new Alumno[a.getCiclo().getTamCiclo()];
		for(int i=0;i<alumnos.length;i++) {
			if(alumnos[i]==null) {
				alumnos[i]=a;
			}
		}
		
	}
	
	public void meterNotas() {
		
	}

}
