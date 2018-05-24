package bestel;

import model.*;

public class ProductBestelling {
	private int hoeveelheid;
	private Product product;
	
	public ProductBestelling (int hoeveelheid, Product product) {
		this.product = product;
		this.hoeveelheid = hoeveelheid;
	}
	
	public ProductBestelling (Product product) {
		this(1, product);
	}
	
	public String toString() {
		return product.getNaam() + ", " + hoeveelheid + " " + product.getEenheidNaam() 
			+ " " + product.getPrijs(hoeveelheid); 
	}
}
