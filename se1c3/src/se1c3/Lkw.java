package se1c3;

public class Lkw extends Kfz {
	
	private int ladeFlaeche;
	private boolean hatAnhaenger;
	
	public Lkw(int sitze, int tankInhalt, double verbrauch, int ladeFlaeche, boolean hatAnhaenger) {
		
		super(sitze, tankInhalt, verbrauch);
		
		this.ladeFlaeche = ladeFlaeche;
		this.hatAnhaenger = hatAnhaenger;
	}
	
	@Override
	public double spritVerbrauch(int km) {
		return super.spritVerbrauch(km) + 1;
	}

}
