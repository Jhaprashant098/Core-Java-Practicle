package Core.Interface;

public class Businessman implements SocialWorker , Richman {
private String name;
private String address;
	@Override
	public void earnMoney() {
		System.out.println("earn money");
	}
	@Override
	public void donation() {
      System.out.println("donation");	
	}
	@Override
	public void party() {
		System.out.println("party");
	}
	@Override
	public void helpToOthers() {
		System.out.println("help to others");
	
	}
}
	
