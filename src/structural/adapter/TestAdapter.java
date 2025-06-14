package adapter;

public class TestAdapter {
	public static void	test()
	{
		// JapanGuy				hikaru  = new JapanGuy("Hikaru");
		EnglishGuy				john    = new EnglishGuy("Jhon");
		
		AdapterEnglishToJapan	adapter = new AdapterEnglishToJapan(john);
		adapter.speakJapaneese("This is adapter DP");
	}
}
