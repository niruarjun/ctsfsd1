package sai;

public abstract class  Electronics2 extends Product{

	  private String manufacturer;

	public Electronics2(double regularPrice, String manufacturer) {
		super(regularPrice);
		this.manufacturer = manufacturer;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	  
}
