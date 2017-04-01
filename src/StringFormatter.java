import java.util.ArrayList;
import java.util.List;

public class StringFormatter
{
	public static void main(String[] args) {
		List<String> wordList = new ArrayList<String>();
wordList.add("A");
wordList.add("frog");
wordList.add("is");
	 System.out.println(totalLetters(wordList));
	}
	
public static int totalLetters (List<String> words)
{
	int letters=0;
	for(int i=0; i<words.size(); i++ )
	{
	letters+=words.get(i).length();
	}
	return letters;
	
}
}