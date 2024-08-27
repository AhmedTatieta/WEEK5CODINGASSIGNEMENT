package week5codingassignments;

public class App {
  
	public static void main(String[] args) {
}   // TODO Auto-generated method stub

   Logger logger = new AsteriskLogger();
   logger.log("Hi");
   logger.error("Errormessage");
   
   Logger loggered = new SpacedLogger();
   loggered.log("Whatsup");
   loggered.error("Hellodear");
}
