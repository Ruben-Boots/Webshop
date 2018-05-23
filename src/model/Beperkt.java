package model;

public class Beperkt extends Product {
	public Beperkt(String naam, int prijsPerEenheid, String imageUrl, int eenheid) {
	//	super(naam, prijsPerEenheid, imageUrl, eenheid);		
	}
	
	public Beperkt(String naam, int prijsPerEenheid, String imageUrl) {
		this(naam, prijsPerEenheid, imageUrl, 4);
	}
	
	public int getPrijs(int hoeveelheid) {
		if (hoeveelheid > 3) {
			return hoeveelheid*getPrijsPerEenheid();
		}else {
		return 2 * getPrijsPerEenheid();
		}
	}
}
