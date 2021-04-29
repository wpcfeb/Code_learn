package HashtableAndString;

public class Q281_RemoveSpaces {
	// Assumption: input is not null
	public String removeSpaces(String input) {
		if (input.isEmpty()) {
			return input;
		}
		char[] array = input.toCharArray();
		int slow = 0;
		for (int j = 0; j < array.length; j++) { // j is fast index
			// when we would ignore the current space character:
			// 1. we ignore all the space characters followed by 
			// another space character, so that if there are several
			// consecutive space characters, only the first one will
			// be remained.
			// 2. we ignore also the space character if it is the
			// first character of the input string.
			if (array[j] == ' ' && (j == 0 || array[j - 1] == ' ')) {
				continue;
			}
			array[slow++] = array[j];
		}
		// Post-processing: it is possible we still have one trailing 
		// space character at the end.
		if (slow > 0 && array[slow - 1] == ' ') {
			slow--;
		}
		return new String(array, 0, slow);
	}
}
