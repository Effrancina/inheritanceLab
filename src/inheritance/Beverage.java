package inheritance;

public class Beverage {
	
	boolean hotOrCold;
	int volume;
	int alcoholPercentage;
	
	public Beverage() {
		
	}
	
	public Beverage(boolean hotOrCold, int volume, int alcoholPercentage) {
		
		this.hotOrCold = hotOrCold;
		this.volume = volume;
		this.alcoholPercentage = alcoholPercentage;
		
	}

	public boolean isHotOrCold() {
		return hotOrCold;
	}

	public void setHotOrCold(boolean hotOrCold) {
		this.hotOrCold = hotOrCold;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getAlcoholPercentage() {
		return alcoholPercentage;
	}

	public void setAlcoholPercentage(int alcoholPercentage) {
		this.alcoholPercentage = alcoholPercentage;
	}
	
	public void fill () {
		this.volume += 100;
		System.out.println("Your drink has " + this.volume + "ml.");
	}

	
	
}
