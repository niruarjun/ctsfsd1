package sai;

public class TV3 extends Electronics2 {
	double size;

	public TV3(double regularPrice, String manufacturer, double size) {
		super(regularPrice, manufacturer);
		this.size = size;
	}

	  public double computeSalePrice(){
	        return super.getRegularPrice() * 0.8;
	    }
	

}
