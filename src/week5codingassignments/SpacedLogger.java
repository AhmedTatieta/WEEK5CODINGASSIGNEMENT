package week5codingassignments;

public class SpacedLogger implements Logger {

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println(message.replace("", " "));
	}

	@Override
	public void error() {
		// TODO Auto-generated method stub
		System.out.println("Error: + message.replace("", ""));
	}

}
