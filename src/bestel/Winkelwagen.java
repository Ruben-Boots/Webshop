package bestel;

import java.util.ArrayList;

public class Winkelwagen {
	private ArrayList<ProductBestelling> wagen;
	
	public void addBestelling(ProductBestelling productBestelling) {
		wagen.add(productBestelling);
	}
	
	public String toString() {
		String str = "";
		for (ProductBestelling be:wagen) {
			str += be +"\n";
		}
		return str;
	}

}
