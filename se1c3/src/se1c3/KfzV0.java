package se1c3;

public class KfzV0 {
	
	public int sitze;
	public int tankInhalt;
	public double verbrauch;
	
	
	public double reichweite() {
		
		return (tankInhalt*100)/verbrauch;
		
	}
	
	public double spritVerbrauch(int km) {
		
		return (tankInhalt*100)/km;
		
	}
}
