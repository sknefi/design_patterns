package command;

public class Light {
	private boolean	state;

	public void	turnOn()
	{
		state = true;
		System.out.println("Turning light ON");
	}

	public void	turnOff()
	{
		state = false;
		System.out.println("Turning light OFF");
	}

	public void	getState()
	{
		System.out.println("Current state: " + (state ? "ON" : "OFF"));
	}
}
