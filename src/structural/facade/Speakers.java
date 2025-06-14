package facade;

public class Speakers implements Device {
	public void	turnOn()
	{
		System.out.println("Turning speakers on");
	}

	public void	turnOff()
	{
		System.out.println("Turning speakers off");
	}		
}