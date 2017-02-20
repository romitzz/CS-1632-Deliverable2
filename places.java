//Zach Romitz CS 1632 Deliverable 2
public class places {
	
	public places(){
		
	}
	//return 1 for outside 0 for inside
	public int  whereto(int x, driver bob){
		
		if(bob.getlocation().equals("Sennott")){
			if(x == 1){
				System.out.println("Driver " + bob.getid() + " heading from Sennott to Outside City via Fifth Ave.");
				System.out.println("Driver " + bob.getid() + " is heading to Cleveland.");
				bob.updatelocation("Outside City");
				return 1;
			}
			else {
				System.out.println("Driver " + bob.getid() + " heading from Sennott to Presby via Bill St.");
				bob.updatelocation("Presby");
				return 0;
			}
			
		}
		else if(bob.getlocation().equals("Presby")){
			if(x == 1){
				System.out.println("Driver " + bob.getid() + " heading from " + bob.getlocation() + " to Union via Fourth.");
				bob.updatelocation("Union");
				return 0;
			}
			else {
				System.out.println("Driver " + bob.getid() + " heading from " + bob.getlocation() + " to Sennott via Bill St.");
				bob.updatelocation("Sennott");
				return 0;
			}
			
		}
		else if(bob.getlocation().equals("Union")){
			if(x == 1){
				System.out.println("Driver " + bob.getid() + " heading from " + bob.getlocation() + " to Outside City via Fourth.");
				System.out.println("Driver " + bob.getid() + " is heading to Philadelphia.");
				bob.updatelocation("Outside City");
				return 1;
			}
			else {
				System.out.println("Driver " + bob.getid() + " heading from " + bob.getlocation() + " to Hillman via Phil St.");
				bob.updatelocation("Hillman");
				return 0;
			}
			
		}
		else if(bob.getlocation().equals("Hillman")){
			if(x == 1){
				System.out.println("Driver " + bob.getid() + " heading from " + bob.getlocation() + " to Sennott via Fifth.");
				bob.updatelocation("Sennott");
				return 0;
			}
			else {
				System.out.println("Driver " + bob.getid() + " heading from " + bob.getlocation() + " to Union via Bill St.");
				bob.updatelocation("Union");
				return 0;
			}
			
		}
		
		
		return -1;
	}

}
