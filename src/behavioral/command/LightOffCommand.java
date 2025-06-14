package command;

public class LightOffCommand implements Command {
	
	private Light	light;

	public LightOffCommand(Light light)
	{
		this.light = light;
	}

	public void	execute()
	{
		if (light != null)
			light.turnOff();
	}

	public void	undo()
	{
		if (light != null)
			light.turnOn();
	}

	public void	show()
	{
		if (this.light != null)
			light.getState();
	}
}
