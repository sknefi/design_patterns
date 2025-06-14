package adapter;

// this design patern translates content of X so Y could understand,
// in this case, X is english guy, content is english text and Y is japaneese guy
// after translating content of english guy the japaneese guy can understand it and work with it
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
