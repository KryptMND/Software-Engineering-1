package se1c3;

public class Kfz {
	
	private int sitze;
	private int tankInhalt;
	private double verbrauch;
	
	Kfz(int sitze, int tankInhalt, double verbrauch) {
		
		this.sitze = sitze;
		this.tankInhalt = tankInhalt;
		this.verbrauch = verbrauch;
		
	}
	
	public double reichweite() {
		
		return (tankInhalt*100)/verbrauch;
		
	}
	
	public double spritVerbrauch(int km) {
		
		return (tankInhalt*100)/km;
		
	}
}
