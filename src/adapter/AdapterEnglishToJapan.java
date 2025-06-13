package adapter;

public class AdapterEnglishToJapan implements JapaneeseSpeakingEntity{
	
	private EnglishSpeakingEntity enEntity;


	private void	translateEngToJpn(String enText)
	{
		 System.out.println("あなたは私を雇うべきです (mocked Japan text - translation for simplicity of DP was not implemented)");
	}

	public AdapterEnglishToJapan(EnglishSpeakingEntity enEntity)
	{
		this.enEntity = enEntity;
	}

	@Override
	public void	speakJapaneese(String text)
	{
		System.out.println("Translating english text to japaneese:");
		enEntity.speakEnglish(text);
		translateEngToJpn(text);
	}
}
