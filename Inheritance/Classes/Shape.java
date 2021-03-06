public class Shape{
	private String color = "red";
	private boolean filled = true;


	public Shape(){
		//
	}

	public Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}

	// Getters & setters

	public String getColor(){
		return color;
	}

	public boolean isFilled(){
		return filled;
	}

	public void setColor(String color){
		this.color = color;
	}

	public void setFilled(boolean filled){
		this.filled = filled;
	}

	public String toString(){
		return String.format("A Shape with color of "+ getColor() + " and " + (filled ? "filled" : "not filled"));

	}
}