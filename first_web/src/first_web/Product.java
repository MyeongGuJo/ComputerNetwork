package first_web;

public class Product {
	private String Name;
	private String Price;
	private String Description;
	private String ImageLocation;
	
	public Product() {}
	
	public Product(String Name, String Price, 
			String Description, String ImageLocation) {
		this.Name = Name;
		this.Price = Price;
		this.Description = Description;
		this.ImageLocation = ImageLocation;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String Price) {
		this.Price = Price;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

	public String getImageLocation() {
		return ImageLocation;
	}

	public void setImageLocation(String ImageLocation) {
		this.ImageLocation = ImageLocation;
	}

	@Override
	public String toString() {
		return "Product [Name=" + Name + ", Price=" + Price + ", Description=" + Description + ", ImageLocation="
				+ ImageLocation + "]";
	}
}
