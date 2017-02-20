import java.util.Random;

	

public class Myrandom {
	
	private  Random rand = new Random(2);
	
	public Myrandom(int seed){
		rand = new Random(seed);
	}
	

	//returns a random of either 1 or 2
	public int ran12(){
		return rand.nextInt(2)+1;
	}
	public int ran14(){
		return rand.nextInt(4)+1;
	}

}
