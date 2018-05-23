package model;

public abstract class Product {
	static final int gram = 1;
	static final int kilo = 2;
	static final int liter = 3;
	static final int stuk = 4;
	static final int pak = 5;
	
	public Product(String naam, int prijspereenheid, String imageUrl, int eenheid) {}
	
	public Product(String naam, int prijspereenheid, String imageUrl) {
		this(naam, prijspereenheid, imageUrl, 0);
	}
	
	public String toString() {
		return getNaam();
	}
	
	abstract public String getNaam();
}
