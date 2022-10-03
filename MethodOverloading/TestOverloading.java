package MethodOverloading;

public class TestOverloading extends OverAdd {
	public static void main(String[] args) {

		OverAdd D = new OverAdd();
		D.add(5, 7);
		D.add(6, 8, 9);
		D.add(2.5, 7);
		D.add(7.3, 4.8);

	}

}
