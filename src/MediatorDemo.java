
public class MediatorDemo
{
	public static void main(String[] args)
	{
		ChatMediator myMed = new ChatMediator();
		
		User Bob = new User(myMed, "Bob");
		User Joe = new User(myMed, "Joe");
		User Tim = new User(myMed, "Tim");
		
		myMed.addUser(Bob);
		myMed.addUser(Joe);
		myMed.addUser(Tim);
		
		Joe.send("Hi Bob");
		/* Program output:
		  	Joe: Sending message = Hi Bob
			Bob: Received message = Hi Bob
			Tim: Received message = Hi Bob
		*/
		
		Bob.send("Hi Joe");
		/* Program output:
		 	Bob: Sending message = Hi Joe
			Joe: Received message = Hi Joe
			Tim: Received message = Hi Joe
		*/
	}
}