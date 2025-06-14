package command;

public class LightOnCommand implements Command {
	
	private Light	light;

	public LightOnCommand(Light light)
	{
		this.light = light;
	}
	
	public void	execute()
	{
		if (this.light != null)
			light.turnOn();
	}

	public void	undo()
	{
		if (this.light != null)
			light.turnOff();
	}

	public void	show()
	{
		if (this.light != null)
			light.getState();
	}
}
