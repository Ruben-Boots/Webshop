package model;

public abstract class Product {
	private String naam;
	private int prijsPerEenheid;
	private int eenheid;
	private String imageUrl;
	static final int gram = 1;
	static final int kilo = 2;
	static final int liter = 3;
	static final int stuk = 4;
	static final int pak = 5;
	
	public Product(String naam, int prijspereenheid, String imageUrl, int eenheid) {
		
	}
	
	public Product(String naam, int prijspereenheid, String imageUrl) {
		this(naam, prijspereenheid, imageUrl, 0);
	}
	
	public String toString() {
		return naam + ", " + getEenheidNaam() + ", " + getPrijsPerEenheid() ;
	}
	
	public int getPrijsPerEenheid() {
		return prijsPerEenheid;
	}
	
	public String getEenheidNaam() {
		switch (eenheid) {
			case gram: return "gram";
			case kilo: return "kilo";
			case liter: return "liter";
			case stuk: return "stuk(s)";
			case pak: return "pak(ken)";
		}
		return "";
	}
	
	public int getPrijs(int hoeveelheid) {
		return prijsPerEenheid * hoeveelheid;
	}
	
	public int getEenheid() {
		return eenheid;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public String getNaam() {
		return naam;
	}
	
}
