//Zach Romitz CS 1632 Deliverable 2


public class driver {
	
	private int id;
	private String location;
	private int laboon = 0;
	
	public driver(int x){
		id = x;
	}
	
	public String setstartlocation(String a){
		location = a;
		return location;
	}
	
	public int updatelocation(String a){
		if(a.equals("Outside City")){
			return 1;
		}
		else if(a.equals("Sennott")){
			laboon++;
			location = a;
			return 0;
		}
		else{
			location = a;
			return 0;
		}
	}
	public String getlocation(){
		return location;
	}
	public int getsennot(){
		return laboon;
	}
	public int getid(){
		return id;
	}

}
