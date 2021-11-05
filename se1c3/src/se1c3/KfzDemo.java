package se1c3;

public class KfzDemo {

	public static void main(String[] args) {
		
		KfzV0 minivan = new KfzV0();
		
		minivan.tankInhalt = 70;
		minivan.sitze = 6;
		minivan.verbrauch = 14;
		
		double reichweite = (minivan.tankInhalt*100)/minivan.verbrauch;
		
		System.out.println("Die Reichweite Des Fahrzeugs ist " + reichweite + "km");
		

	}

}
