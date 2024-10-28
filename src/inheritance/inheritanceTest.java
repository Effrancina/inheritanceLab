package inheritance;

public class inheritanceTest {

	public static void main(String[] args) {
		Beverage myTea = new Tea();
//		myTea.fill();


		Beverage myBeer = new Beer();
//		myBeer.fill();

		Beverage[] drinks = new Beverage[2];
		drinks[0] = myTea;
		drinks[1] = myBeer;
		
		
		for(int i=0; i<drinks.length; i++) {
			drinks[i].fill();
		}
		
	}

}
