package Polimosphism;

public class  TestShape {
	public static void main(String[] args) {
		
		Shape d = new Rectangle();
	
		Shape[] v = new Shape[2];
		
		v[0] = new Circle(4 );
		v[1] = new Rectangle(6 , 8);
		
		for(int i=0; i<v.length; i++){
			System.out.println(v[i].area());
		}
		double tarea = calcArea(v);
		System.out.println(tarea);
	}
	private static double calcArea(Shape[] v){
		double tarr =0;
		for(int i =0; i<v.length; i++){
			tarr = tarr + v[i].area();
			
			System.out.println(tarr);
		
			
		
		}
		return tarr;	
		
 }
}
