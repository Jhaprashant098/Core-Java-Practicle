package Core.Exercise;

public class BufferREverse {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("shivraj singh chouhan");
		System.out.println(sb.charAt(9));
		System.out.println("length:" + sb.length());
		System.out.println(sb.replace(0,7,"vijay"));
		System.out.println(sb.reverse());
	}

}
