
public class Aplicacion {

	public static void main(String[] args) {
		boolean salir=false;
		Ciclo c1=new Ciclo("DW31","Desarrollo Web");
		Nota n1=new Nota(1,"Fol",8.00);
		Alumno a1=new Alumno("81273992P", "Pedro", "24/01/1998", c1,n1);
		do{
			
           System.out.println("1. Ver nota del alumno");
           System.out.println("2. Opcion 2");
           System.out.println("3. Opcion 3");
           System.out.println("4. Salir");
           System.out.println("Escribe una de las opciones");
           int opcion = Console.readInt();
	           switch(opcion){
	               case 1:
	                   System.out.println("Has seleccionado la opcion 1");
	                   System.out.println(a1.getNota());
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
