package adapter;

public class EnglishGuy implements EnglishSpeakingEntity {
	private String	name;

	public EnglishGuy(String name)
	{
		this.name = name;
	}

	public void	speakEnglish(String text)
	{
		System.out.println(name + " speaking: " + text);
	}
}
