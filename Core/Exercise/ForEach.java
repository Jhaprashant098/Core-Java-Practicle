package Core.Exercise;

public class ForEach {
public static void main(String[] args) {
	//array
	int [] b={2,3,4,5,6,7,8,9};
	 for (int i=0; i<8; i++) {
 System.out.println(b[i]);
	 }
	 for (int i : b) {
		System.out.println(i);
	}
}
}

