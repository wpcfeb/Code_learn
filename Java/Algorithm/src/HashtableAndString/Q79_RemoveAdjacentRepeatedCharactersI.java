package HashtableAndString;
public class Q79_RemoveAdjacentRepeatedCharactersI {
	// Try to convert the input to char[],
	// and do it in place.
	public String deDup(String input) {
		if (input == null) {
			return null;
		}
		char[] array = input.toCharArray();
		int slow = 0;
		for (int j = 0; j < array.length; j++) {
			// repeated characters will be ignored except
			// for the first character in the sequence.
			if (slow == 0 || array[j] != array[slow - 1]) {
				array[slow++] = array[j];
			}
		}
		return new String(array, 0, slow);
	}
}