package practicaClases;

public class AppFiguras {

	public static void main(String[] args) {
		
		// declaracion de variables 
		
		Figuras figura1; 						//aqui se crea el objeto figura1
		figura1=new Triangulos();				//aqui se llama al metodo constructor 
		
		Figuras figura2 =new Circulos(); // crea un objeto y llama de una vez al metodo constructor 
		
	
		Figuras figura3;
		figura3 = new Cuadrados();
		
		// metodo en caso de que sea public figura2.altura =20;
		figura2.setAltura(20);
		figura2.setColor("red");
		//figura3.altura = 30; igual que el otro de arriba 
		//figura3.base = 30; ------ es otra forma de llamar al valor si el constructor es public 
		figura3.setAltura(30);
		figura3.setBase(30);
		figura3.setColor("verde");
		
		Triangulos triangulo1 = new Triangulos();
		triangulo1.setBase(40);
		triangulo1.setAltura(40);
		triangulo1.setColor("rosa mexicano");
		triangulo1.setTipo("isoceles");
		
		//Triangulos triangulo2 = new Figuras(10); queda pendiente 
		
		
		
		
		//salidas del sistema
		
		System.out.println("valor de figura1");
		System.out.println(figura1.getBase());	// intellisense 	investigar 
		System.out.println(figura1.getAltura());
		System.out.println(figura1.getArea());
		System.out.println(figura1.getPerimetro());
		System.out.println(figura1.getColor());
		
		System.out.println("valores figura2");
		System.out.println(figura2.getAltura());	// intellisense 	investigar -------- syso + ctrl+ barra espaciadora 
		System.out.println(figura2.getBase());
		System.out.println(figura2.getColor());
		
		System.out.println("valores figura3");
		System.out.println(figura3.getAltura()); //asi se manda llamar el metodo get para poder mostrar una variable de tipo private
		System.out.println(figura3.getBase());
		System.out.println(figura3.getColor());
		
		System.out.println("valores del triangulo");
		System.out.println(triangulo1.getAltura());
		System.out.println(triangulo1.getBase());
		System.out.println(triangulo1.getColor());
		System.out.println(triangulo1.getTipo());
		
		
		
		
	}

}
