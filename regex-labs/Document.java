//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class Document
{
	private String text;

	//@param text The full text of the Document.
	public Document(String text)
	{
		this.text = text;
	}

	/** Returns the tokens that match the regex pattern from the document
	 * text string.
	 * @param pattern A regular expression string specifying the
	 *   token pattern desired
	 * @return A List of tokens from the document text that match the regex
	 *   pattern
	 */
	protected List<String> getTokens(String pattern)
	{
		ArrayList<String> tokens = new ArrayList<String>();
		Pattern tokSplitter = Pattern.compile(pattern);
		Matcher m = tokSplitter.matcher(text);

		while (m.find()) {
			tokens.add(m.group());
		}

		return tokens;
	}

	// This is a helper function that returns the number of syllables
	// in a word.  You should write this and use it.
	public int countSyllables(String word)
	{
		// TODO: Implement this method
		int numSyllables = 0;
		Pattern p = Pattern.compile("[aeiouyAEIOUY]+");
		Matcher m = p.matcher(word);
		while (m.find()) {
			if (m.hitEnd() && m.group().toLowerCase().equals("e") && numSyllables==0)numSyllables++;
			else if (!m.hitEnd() || (m.hitEnd() && !m.group().toLowerCase().equals("e"))) numSyllables++;
		}
		return numSyllables;
	}

	/**
	 * Get the number of words in the document.
	 * "Words" are defined as contiguous strings of alphabetic characters
	 * i.e. any upper or lower case characters a-z or A-Z
	 *
	 * @return The number of words in the document.
	 */
	public int getNumWords()
	{
		int numWords = 0;
		Pattern p = Pattern.compile("[a-zA-Z]+");
		Matcher m = p.matcher(text);
		while (m.find())
			numWords++;
		return numWords;
	}

	/**
	 * Get the number of sentences in the document.
	 * Sentences are defined as contiguous strings of characters ending in an
	 * end of sentence punctuation (. ! or ?) or the last contiguous set of
	 * characters in the document, even if they don't end with a punctuation mark.
	 *
	 * @return The number of sentences in the document.
	 */
	public int getNumSentences()
	{
		int numSentences = 0;
		Pattern p = Pattern.compile("[[a-zA-Z0-9][ ,:;()]]+");
		Matcher m = p.matcher(text);
		while (m.find())
			numSentences++;

    	return numSentences;
	}

	/**
	 * Get the number of sentences in the document.
	 * Words are defined as above.  Syllables are defined as:
	 * a contiguous sequence of vowels, except for an "e" at the
	 * end of a word if the word has another set of contiguous vowels,
	 * makes up one syllable.   y is considered a vowel.
	 * @return The number of syllables in the document.
	 */
	public int getNumSyllables()
	{
	    //TODO: Implement this method.
     	int count=0;
		Pattern p = Pattern.compile("[a-zA-Z]+");
		Matcher m = p.matcher(text);
		while (m.find())
			count += countSyllables(m.group());
   	    return count;
	}

	public String getText(){
		return text;
	}

	/** A method for testing
	 *
	 * @param doc The Document object to test
	 * @param syllables The expected number of syllables
	 * @param words The expected number of words
	 * @param sentences The expected number of sentences
	 * @return true if the test case passed.  False otherwise.
	 */
	public static boolean testCase(Document doc, int syllables, int words, int sentences)
	{
		System.out.println("Testing text: ");
		System.out.print(doc.getText() + "\n....");
		boolean passed = true;
		int syllFound = doc.getNumSyllables();
		int wordsFound = doc.getNumWords();
		int sentFound = doc.getNumSentences();
		if (syllFound != syllables) {
			System.out.println("\nIncorrect number of syllables.  Found " + syllFound
					+ ", expected " + syllables);
			passed = false;
		}
		if (wordsFound != words) {
			System.out.println("\nIncorrect number of words.  Found " + wordsFound
					+ ", expected " + words);
			passed = false;
		}
		if (sentFound != sentences) {
			System.out.println("\nIncorrect number of sentences.  Found " + sentFound
					+ ", expected " + sentences);
			passed = false;
		}

		if (passed) {
			System.out.println("passed.\n");
		}
		else {
			System.out.println("FAILED.\n");
		}
		return passed;
	}


	/* The main method for testing this class.
	 * You are encouraged to add your own tests.  */
	public static void main(String[] args)
	{
		testCase(new Document("This is a test.  How many???  "
		        + "Senteeeeeeeeeences are here... there should be 5!  Right?"),
				16, 13, 5);
		testCase(new Document(""), 0, 0, 0);
		testCase(new Document("sentence, with, lots, of, commas.!  "
		        + "(And some poaren)).  The output is: 7.5."), 15, 11, 4);
		testCase(new Document("many???  Senteeeeeeeeeences are"), 6, 3, 2);
	}

}
