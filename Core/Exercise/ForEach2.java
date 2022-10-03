package Core.Exercise;

public class ForEach2 {
public static void main(String[] args) {
	//
	int [] r={10,12,14,16,18,20,22,24,26,28,30};
	for (int p=0; p<=7; p++ ) {
		System.out.println(r[p]);
	}
		for (int p : r) {
			
			System.out.println(p);
		}
	}
}
