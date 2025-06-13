package adapter;

public class JapanGuy implements JapaneeseSpeakingEntity {
	private String	name;

	public JapanGuy(String name)
	{
		this.name = name;
	}

	public void	speakJapaneese(String text)
	{
		System.out.println(this.name + " speaking: " + text);;
	}
}
