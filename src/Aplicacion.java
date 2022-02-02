
public class Aplicacion {

	public static void main(String[] args) {
		boolean salir=false;
		Ciclo c1=new Ciclo("DW31","Desarrollo Web");
		Ciclo c2=new Ciclo("ASIR","Informatica");
		Nota n1=new Nota(1,"Fol",8.00);
		Nota n2=new Nota(2,"Programación",5.72);
		Nota n3=new Nota(2,"Fol",4.20);
		Nota n4=new Nota(3,"Sistemas Informáticos",6.98);
		Alumno a1=new Alumno("81273992P", "Pedro", "24/01/1998", c1,n1);
		Alumno a2=new Alumno("38492774Q", "Carlos", "07/11/1998", c2,n2);
		Alumno a3=new Alumno("31049318D", "Miren", "27/04/1998", c2,n3);
		Alumno a4=new Alumno("82918374Ñ", "Errobi", "06/08/2000", c1,n4);
		do{
			
           System.out.println("1. Ver nota de cada alumno");
           System.out.println("2. Ver notas por modulos");
           System.out.println("3. Opcion 3");
           System.out.println("4. Salir");
           System.out.println("Escribe una de las opciones");
           int opcion = Console.readInt();
	           switch(opcion){
	               case 1:
	                   System.out.println("Has seleccionado la opcion 1");
	                   System.out.println();
	                   a1.verNotayAlumno();
	                   a2.verNotayAlumno();
	                   a3.verNotayAlumno();
	                   a4.verNotayAlumno();
	                   System.out.println();
	                   break;
	               case 2:
	                   System.out.println("Has seleccionado la opcion 2");
	                   System.out.println();
	                   a1.verNotayModulo();
	                   a2.verNotayModulo();
	                   a3.verNotayModulo();
	                   a4.verNotayModulo();
	                   System.out.println();
	                   break;
	                case 3:
	                   System.out.println("Has seleccionado la opcion 3");
	                   System.out.println();
	                   System.out.println("Introduce la nueva nota del alumno 1");
	                   double nuevaNota=Console.readDouble();
	                   a1.cambiarNota(nuevaNota);
	                   System.out.println();
	                   System.out.println("Introduce la nueva nota del alumno 2");
	                   double nuevaNota2=Console.readDouble();
	                   a2.cambiarNota(nuevaNota2);
	                   System.out.println();
	                   System.out.println("Introduce la nueva nota del alumno 3");
	                   double nuevaNota3=Console.readDouble();
	                   a3.cambiarNota(nuevaNota3);
	                   System.out.println();
	                   System.out.println("Introduce la nueva nota del alumno 4");
	                   double nuevaNota4=Console.readDouble();
	                   a4.cambiarNota(nuevaNota4);
	                   System.out.println();
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

}
