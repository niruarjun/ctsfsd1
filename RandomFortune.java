package task;



import java.util.Random;

public class RandomFortune {
	private String fortune[]= {
			"DemoFortune-1","DemoFortune-2",
			"DemoFortune-3","DemoFortune-4","DemoFortune-5"
			
	};
	
	public String getDailyFortune()
	{

		Random random=new Random();
		return fortune[random.nextInt(5)];
	}

}