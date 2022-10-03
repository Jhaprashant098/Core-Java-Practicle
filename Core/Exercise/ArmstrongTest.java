package Core.Exercise;
public class ArmstrongTest {
public static void main(String[] args) {
	int number= 153;
	int r=0;
	int sum =0;
	int n= number;
	while(n >0) {
		r=n % 10;
		n = n/10;
	sum= sum+(r*r*r);}
	if(sum ==  number){
		System.out.println("Armstrong Number");
	} else {
		System.out.println("not Armstrong Number");
	}
	
}
}