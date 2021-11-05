package se1c3;

public class ZweiKfz {

	public static void main(String[] args) {
		
		KfzV0 sportwagen = new KfzV0();
		KfzV0 minivan = new KfzV0();
		
		minivan.tankInhalt = 70;
		minivan.sitze = 6;
		minivan.verbrauch = 14;
		
		sportwagen.tankInhalt = 45;
		sportwagen.sitze = 2;
		sportwagen.verbrauch = 11;
		
		double reichweite1 = (sportwagen.tankInhalt*100)/sportwagen.verbrauch;
		
		double reichweite2 = (minivan.tankInhalt*100)/minivan.verbrauch;
		
		System.out.println("Die Reichweite des Minivan ist " + reichweite1 + "km");
		
		System.out.println("Die reichweite des Sportwagen ist " + reichweite2 + "km");
	}

}
