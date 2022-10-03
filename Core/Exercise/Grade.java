package Core.Exercise;

public class Grade {
	public static void main(String[] args) {
		int a = 85;

		if (a > 80 && a < 100) {
			System.out.println("Grade A+");
		} else if (a > 60 && a < 80) {
			System.out.println("Grade A");
		} else if (a > 45 && a < 60) {
			System.out.println("Grade B");
		} else if (a > 33 && a < 45) {
			System.out.println("Grade C");
		} else {
			System.out.println("fail");
		}

	}

}
