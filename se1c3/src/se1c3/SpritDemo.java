package se1c3;

public class SpritDemo {

	public static void main(String[] args) {
		
		KfzV0 sportwagen = new KfzV0();
		KfzV0 minivan = new KfzV0();
		
		minivan.tankInhalt = 70;
		minivan.sitze = 6;
		minivan.verbrauch = 14;
		
		sportwagen.tankInhalt = 45;
		sportwagen.sitze = 2;
		sportwagen.verbrauch = 11;
		
		int km = 252;
		
		System.out.println("Der Verbrauch des Minivan fuer "+ km + "km ist " + minivan.spritVerbrauch(km) + "l");
		System.out.println("Der Verbrauch des Sportwagen fuer " + km + "km ist " + sportwagen.spritVerbrauch(km) + "l");
		
	}

}
