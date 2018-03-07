package practicaClases;

public abstract class Figuras implements IFiguras,IFiguras2 { //se le agrega "abstract" y se convierte en una clase abstracta, y con la palabra "implements" se implementa la interfaz animales
	
		private int base;
		private int altura;
		private String color;
		private double Area;
		private double Perimetro;
			
			Figuras(int b, int a)	//constructor 
			{
				
				base=b;
				altura=a;
			}
			
			Figuras(){			//otro constructor 
				
			}
			
			Figuras(int b)			// un constructor mas 
			{
				
				base=b;
				
			}
			
			Figuras(int a, int b, String color) //constructor agregando otro atributo en este caso "color" 
			{
				
			}
			
			public	void setAltura(int altura) //le vamos a asignar valor a altura si el atributo es 
												//private que solo permite acceder mediante un constructor con getters-setters
			{
				this.altura = altura;
				//ó altura =_altura poniendo el guion bajo en la declaracion del set 
			}
			
			public void setBase(int base)
			{
				this.base = base;
				
			}
			
			public int getAltura()
			{
				return altura;
				
			}
			
			public int getBase()
			{
				return base;
				
			}
			
			public void setColor(String color) 
			{
				this.color=color;
			}
			
			public String getColor()
			{
				return color;
				
			}
			
			public void setPerimetro(double Perimetro ) 
			{	
				this.Perimetro = Perimetro;
				
			}
			
			public double getPerimetro()
			{
				return Perimetro;
				
			}
			
			public void setArea(double Area)
			{
				this.Area = Area;
				
			}
			
			public double getArea()
			{
				return Area;
			}
			
			public double calcularArea()
			{
				return Area =Area *2;
			}
			
			
			
}
