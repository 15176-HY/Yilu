package yichang;

public class Triangle{
	
	private double a;
	private double b;
	private double c;
	
	public Triangle(double a,double b,double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double area() throws NotTriangle{
		if(a<=0 || b<=0 || c<=0 ||a + b<= c||a + c<= b||
				c + b<= a) {
			throw new NotTriangle ("无法构成三角形");
		}
		
		double s = (a+b+c) /2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		
	}
	
	
	
	public static void main(String[] args) {
		try {
			Triangle triangle1 = new Triangle(3.0,4.0,5.0);
			System.out.println("三角形面积为"+triangle1.area());
			
		}catch(NotTriangle e){
			System.out.println(e.getMessage());
		}
		try {
			Triangle triangle1 = new Triangle(1.0,1.0,2.0);
			System.out.println("三角形面积为"+triangle1.area());
			
		}catch(NotTriangle e){
			System.out.println(e.getMessage());
		}
				
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
