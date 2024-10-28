package inheritance;

public class Tea extends Beverage{

	public Tea() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void fill() {
		this.volume += 50;
		System.out.println("Your tea has " + this.volume + "ml.");
	}

}
