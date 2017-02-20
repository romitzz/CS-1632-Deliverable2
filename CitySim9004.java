//Zach Romitz CS 1632 Deliverable 2

public class CitySim9004 {

	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("Invalid number of arguements");
			return;
		}
		String input = args[0];
		int seed;
		try{
			
			seed = Integer.parseInt(input);
		}
		catch(NumberFormatException f){
			System.out.println("Integer arguement required");
			return;
		}
		
		Myrandom rand = new Myrandom(seed);
		
		for(int x = 1; x<6; x++){
			int dir;
			boolean inside = true;
			driver bob = new driver(x);
			int start = rand.ran14();
				if(start == 1)
					bob.setstartlocation("Presby");
				else if(start == 2)
					bob.setstartlocation("Union");
				else if(start == 3)
					bob.setstartlocation("Hillman");
				else
					bob.setstartlocation("Sennott");
			
			while(inside){
				places directions = new places();
				dir =  directions.whereto(rand.ran12(), bob);
				if(dir == 1)
					inside = false;
				else if(dir == -1){
					System.out.println("Error doing directions");
					return ;
				}
	
			}
			
			System.out.println("Driver " + x + " met with Professor Laboon " + bob.getsennot() + " time(s).");
			if(bob.getsennot() >=3)
				System.out.println("Wow, that driver need lots of CS help!");
			else if(bob.getsennot() == 0)
				System.out.println("Bummer, that student missed out. :(");
			
			
			System.out.println("\n\n-----\n\n");
			
		}
		
	}

	
	


}
