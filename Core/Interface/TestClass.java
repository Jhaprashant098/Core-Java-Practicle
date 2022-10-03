package Core.Interface;

public class TestClass {
public static void main(String[] args) {
	
	SocialWorker s = new Businessman();
	s.helpToOthers();
	
	Richman d = new Businessman();
	d.earnMoney();
	d.donation();
	d.party();
}
}
