package tcp_server;

import java.util.List;

public class ProductData {
	private List<Product> Furniture;
	
	public ProductData() {}
	public ProductData(List<Product> products) {
		this.Furniture = products;
	}

	public List<Product> getProducts() {
		return Furniture;
	}

	public void setProducts(List<Product> products) {
		this.Furniture = products;
	}
	
}
