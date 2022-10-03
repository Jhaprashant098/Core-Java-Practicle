package Prashant;

public class ExBook17 {
	public static void main(String[] args) {
	int [] a= {3,5,1,8,11,9};
	int[] b={3,5,1,8,9};		
	  	int s1 = 0;
	  	for(int i=0; i<a.length; i++){
	  		s1=s1+a[i];}
	  	{
	/*System.out.println(s1);
	
	}*/
	  	int s2=0;
	  	for(int i=0; i<b.length; i++)
	  	{
	  		s2=s2+b[i];
	  	}
	  	/*System.out.println(s2); 
*/
       System.out.println("missing number is:"+(s1-s2));
	}
	}
	}
