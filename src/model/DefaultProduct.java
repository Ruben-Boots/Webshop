package model;

public class DefaultProduct extends Product{
	
	public DefaultProduct(String naam, int prijsPerEenheid, String imageUrl, int eenheid) {
		super(naam, prijsPerEenheid, imageUrl, eenheid);		
	}
	
	public DefaultProduct(String naam, int prijsPerEenheid, String imageUrl) {
		this(naam, prijsPerEenheid, imageUrl, 4);
	}
}
