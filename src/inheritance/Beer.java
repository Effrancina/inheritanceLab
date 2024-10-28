package inheritance;

public class Beer extends Beverage{

	@Override
	public void fill() {
		this.volume += 330;
		System.out.println("Your beer has " + this.volume + "ml.");
	}
	
}
