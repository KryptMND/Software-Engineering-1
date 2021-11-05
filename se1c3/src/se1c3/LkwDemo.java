package se1c3;

public class LkwDemo {

	public static void main(String[] args) {
		
		Kfz sportwagen = new Kfz(2, 45, 11);
		Lkw magirus = new Lkw(2, 45, 11, 30, false);
		
		int km = 252;
		
		
		System.out.println("Der Verbrauch des Minivan fuer "+ km + "km ist " + sportwagen.spritVerbrauch(km) + "l");	
		System.out.println("Der Verbrauch des Sportwagen fuer " + km + "km ist " + magirus.spritVerbrauch(km) + "l");

	}

}
