package pl.sda.overload;

public class Adder {
	
	public void add(int a, int b)  {
		
		System.out.println(a +  b);
		System.out.println("wykona� sie int");
	}
	
	public void add(byte a, byte b)  {
		
		System.out.println(a +  b);
		System.out.println("wykona� sie byte");
	}

	public void add(double a, double b)  {
			
		System.out.println(a + b);
		System.out.println("Wykona� sie ma�y double");
			
	}
	
	public void add(Double a, Double b)  {
		
		System.out.println(a +  b);
		System.out.println("Wykona� sie du�y double");
			
	}
	
	public void add(long a, long b)  {
		
		System.out.println(a +  b);
		System.out.println("Wykona� si� long");
			
	}
	
}
