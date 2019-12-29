package testJava;

public class WordCount {

	static int countWords(String inputString) {
		String[] strarray = inputString.split(" "); // Spilt String by Space
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (String s : strarray) {
			if (!s.equals("")) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {

		String string = "    India Is   My Country  what about  ";
		System.out.println(wordcount(string) + " words.");
		System.out.println(countWords(string) + " words.");

	}

	static int wordcount(String string) {
		int count = 0;

		char ch[] = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			ch[i] = string.charAt(i);
			if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {
				count++;
			}
		}
		return count;
	}
}
