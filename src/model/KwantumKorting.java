package model;

public class KwantumKorting extends Product{
	public KwantumKorting(String naam, int prijsPerEenheid, String imageUrl, int eenheid) {
	//	super(naam, prijsPerEenheid, imageUrl, eenheid);		
	}
	
	public KwantumKorting(String naam, int prijsPerEenheid, String imageUrl) {
		this(naam, prijsPerEenheid, imageUrl, 4);
	}
	
	public int getPrijs(int hoeveelheid) {
		if (hoeveelheid > 4) {
			return (int) (hoeveelheid*getPrijsPerEenheid()*0.8);
		}else {
		return hoeveelheid * getPrijsPerEenheid();
		}
	}
}
