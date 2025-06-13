package facade;

public class HomeFacade {

	private Tv			tv			= new Tv();
	private Lights		lights		= new Lights();
	private Speakers	speakers	= new Speakers();

	public void	watchTv()
	{
		lights.turnOn();
		tv.turnOn();
		speakers.turnOn();
	}

	public void	endWatchingTv()
	{
		lights.turnOff();
		tv.turnOff();
		speakers.turnOff();
	}
}
