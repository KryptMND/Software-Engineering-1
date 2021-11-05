package se1c3;

public class ReturnDemo {

	public static void main(String[] args) {
		
		KfzV0 sportwagen = new KfzV0();
		KfzV0 minivan = new KfzV0();
		
		minivan.tankInhalt = 70;
		minivan.sitze = 6;
		minivan.verbrauch = 14;
		
		sportwagen.tankInhalt = 45;
		sportwagen.sitze = 2;
		sportwagen.verbrauch = 11;
		
		
		System.out.println("Die Reichweite des Minivan ist " + minivan.reichweite() + "km");
		
		System.out.println("Die reichweite des Sportwagen ist " + sportwagen.reichweite() + "km");
		
	}

}
