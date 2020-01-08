package sai;

public class Mp3Player4 extends Electronics2 {
 private String color;

public Mp3Player4(double regularPrice, String manufacturer, String color) {
	super(regularPrice, manufacturer);
	this.color = color;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}
 
public double computeSalePrice(){
    return super.getRegularPrice() * 0.9;
}


}

