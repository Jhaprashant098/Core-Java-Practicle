package Prashant.Core.Oop;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile s = new Automobile();
		s.setColor("Black");
		s.setMake("Fortuner");
		System.out.println(s.getColor());
		System.out.println(s.getMake());
		
		s.changeGear(1);
		s.accelerator();
		s.getSpeed();
		s.changeGear(2);
		s.accelerator();
		s.getSpeed();
		s.Break();
		s.getSpeed();
		
	}

}
