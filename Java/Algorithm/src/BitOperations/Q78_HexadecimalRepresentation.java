package BitOperations;
public class Q78_HexadecimalRepresentation {
	// Assumption: for non-negative input.
	public String toHex(int num) {
		if (num == 0) {
			return "0x0";
		}
		char[] base = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F'};
		boolean isLeading = true;
		StringBuilder sb = new StringBuilder("0x");
		for (int i = 28; i >= 0; i -= 4) {
			char cur = base[(num >> i) & 0xf];
			if (cur != '0' || !isLeading) {
				sb.append(cur);
				isLeading = false;
			}
		}
		
		return sb.toString();
	}
}
