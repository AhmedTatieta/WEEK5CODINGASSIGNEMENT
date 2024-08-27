package week5codingassignments;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("***" + message + "***");
	}

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		System.out.println("*****************");
		System.out.println("***Error: " + message + "***");
	    System.out.println("****************");
	
 
	}

	@Override
	public void error() {
		// TODO Auto-generated method stub
		
	}   
	

}
