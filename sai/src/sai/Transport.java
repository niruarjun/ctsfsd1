package sai;

public abstract class Transport {
	private int src;
	private int dest;
	private double speed;
	public double calculateDistance(double src,double dest)
	{
		return dest-src;
	}
	public double fuelEfficiency(double intfuel,double compfuel)
	{  
		double fuelConsume=compfuel-intfuel;
       return fuelConsume ; 
    }
	
}

