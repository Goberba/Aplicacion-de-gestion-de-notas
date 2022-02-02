
public class Aplicacion {

	public static void main(String[] args) {
		boolean salir=false;
		do{
			
           System.out.println("1. Opcion 1");
           System.out.println("2. Opcion 2");
           System.out.println("3. Opcion 3");
           System.out.println("4. Salir");
           System.out.println("Escribe una de las opciones");
           int opcion = Console.readInt();
	           switch(opcion){
	               case 1:
	                   System.out.println("Has seleccionado la opcion 1");
	                   break;
	               case 2:
	                   System.out.println("Has seleccionado la opcion 2");
	                   break;
	                case 3:
	                   System.out.println("Has seleccionado la opcion 3");
	                   break;
	                case 4:
	                   salir=true;
	                   break;
	                default:
	                   System.out.println("Solo números entre 1 y 4");
	           }
	       }
	      while(salir==false);
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
