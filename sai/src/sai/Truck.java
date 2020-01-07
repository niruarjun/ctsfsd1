package sai;

public class Truck extends Transport {
	double temp;
	public double calculateDistance(double src,double dest)
	{
		temp=dest-src;
		return temp;
	}
	public double fuelEfficiency(double intfuel,double compfuel)
	{  
		double fuelConsume=intfuel-compfuel;
       return temp/fuelConsume ; 
	
}
}
