package Core.Exercise;

public class HarmonicSeries {
	public static void main(String[] args) {
		int hrr=8; 
	    double s1 =0.0;
		System.out.println("the Harmonic Series");
		while(hrr > 0){
		 s1 = s1 + (double) 1 / hrr; 
		hrr--; 
		System.out.println(s1);
			}	    
}
}
