
public class User
{
	private ChatMediator mediator;
	private String name;
	
	public String getName()
	{
		return name;
	}
	
	public User(ChatMediator med, String name)
	{
		this.mediator = med;
		this.name  = name;
	}
	
	public void send(String msg)
	{
		System.out.println(this.name + ": Sending message = " + msg);
		mediator.sendMessage(msg, this);
	}
	
	public void receive(String msg)
	{
		System.out.println(this.name + ": Received message = " + msg);
	}
}
