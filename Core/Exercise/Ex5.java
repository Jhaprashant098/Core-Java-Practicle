package Core.Exercise;

public class Ex5 {
	//riverse digits of given numbers
	public static void main(String[] args) {
		int rem,rev = 0,num=123456;
		for(int i=1; num!=0; i++) {
			rem=num%10;
			rev = rev*10+rem;
			//System.out.println(rev);
			num=num/10;
			//System.out.println(num);
			
		}
		System.out.println(rev);
	}

}
