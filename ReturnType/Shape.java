package ReturnType;

public class Shape {
	private String color;
	private int borderwidth;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	public Shape getShape(int i){
		if(i==1){
			return new Circle();
		}
		if(i==2) {
			return new Rectangle();
		}
		if(i==3){
			return new Tringle();
		}
		return new Shape();
		}
     }
