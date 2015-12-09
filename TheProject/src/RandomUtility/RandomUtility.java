package RandomUtility;

import java.util.Random;

public class RandomUtility {
	Random random = new Random();
	public static final RandomUtility instance = new RandomUtility();
	
	public RandomUtility getInstance(){
		return instance;
	}
	
	public final int random(int a,int b){
		return a + random.nextInt(b+1);
	}
}
