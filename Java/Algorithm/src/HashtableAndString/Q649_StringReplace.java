package HashtableAndString;

public class Q649_StringReplace {
	// Method 2: Using Java's StringBuilder utility and String's indexof(),
	// not using String's replace()...
	public String replaceII(String input, String s, String t) {
		// Assumptions: input, s, t are not null, s is not empty.
		StringBuilder sb = new StringBuilder();
		// We check if there exists a substring same as s
		// in the substring of input starting at fromIndex.
		// fromIndex: An int value, representing the index position to start the search from
		int fromIndex = 0;
		int matchIndex = input.indexOf(s, fromIndex);
		while (matchIndex != -1) {
			sb.append(input, fromIndex, matchIndex).append(t);// append lead part + t
			// Next time we need to start from matchIndex + s.length()
			// to find if we have later matches.
			fromIndex = matchIndex + s.length();
			matchIndex = input.indexOf(s, fromIndex);
		}
		sb.append(input, fromIndex, input.length()); // add tail part
		return sb.toString();
	}
}
