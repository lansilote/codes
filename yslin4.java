public class yslin4 {
	public static void main(String [] args){

	}
}

class Computer{
	String name;
	int Calculate(String calstr){
		return Integer.valueOf(calstr);
	}
	Computer(String comstr){
		name = comstr;
	}
}

interface Portable{
	void moveIt(String portstr);
	
}

class Laptop extends Computer implements Portable{
	double weight;
	Laptop(String ls, double lw){
		super(ls);
		weight = lw;
		moveIt(ls);
	}
	public void moveIt(String pst){
		System.out.println(pst + " has been moved.");
	}
}

class Handheld extends Computer implements Portable{
	int speed;
	String pocket;
	Handheld(String hs, int s){
		super(hs);
		speed = s;
	}
	public void moveIt(String pk){
		pocket = pk;
	}
	
}
class Desktop extends Computer{
	boolean floppyDrive;
	Desktop(String ds, boolean db){
		super(ds);
		floppyDrive = db;
	}
}