package HashtableAndString;

public class Q84_ReverseWordsInSentence {
	// Assumptions:
	// 1). The words are separated by one space character.
	// 2). There are no leading or trailing spaces.
	// 3).input is not null.
	public String reverseWords(String input) {
		// try to convert it to char array and
		// solve the problem in-place
		char[] array = input.toCharArray();
		// 1. reverse the whole char Array.
		reverse(array, 0, array.length - 1);
		int start = 0;
		// 2. reverse each of the words.
		for (int i = 0; i < array.length; i++) {
			// the start index of a word
			if (array[i] != ' ' && (i == 0 || array[i - 1] == ' ')) {
				start = i;
			}
			// the end index of a word.
			if (array[i] != ' ' && (i == array.length - 1 || array[i + 1] == ' ')) {
				reverse(array, start, i);
			}
		}
		return new String(array);
	}
	
	private void reverse(char[] array, int left, int right) {
		while (left < right ) {
			char temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
	}
}
