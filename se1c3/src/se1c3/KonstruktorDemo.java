package se1c3;

public class KonstruktorDemo {

	public static void main(String[] args) {
		
		Kfz minivan = new Kfz(6, 70, 14);
		Kfz sportwagen = new Kfz(2, 45, 11);
		
		int km = 252;		
		
		System.out.println("Der Verbrauch des Minivan fuer "+ km + "km ist " + minivan.spritVerbrauch(km) + "l");
		System.out.println("Der Verbrauch des Sportwagen fuer " + km + "km ist " + sportwagen.spritVerbrauch(km) + "l");

	}

}
