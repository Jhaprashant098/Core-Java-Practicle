package Core.Exercise;

public class Equals {
	public static void main(String[] args) {
		
		StringBuffer s3=new StringBuffer("java");
		StringBuffer s4=new StringBuffer("java");
		
		
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		System.out.println(s3.append(s4));
		
		String s1="java";
		String s2="java";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
	System.out.println(s1.concat(s2));
	}

 
}
