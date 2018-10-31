public class Homework6 {

	/* Finish the constructor and create any necessary instance
	 * variables
	 */
	String str;
	int aa, bb, cc;
	public Homework6(String s, int a, int b, int c) {
		str = s;
		aa = a;
		bb = b;
		cc = c;
	}

	/* Return true if the stored String comes before the provided
	 * String lexicographically, return false if it does not
	 */
	public boolean isBefore(String other) {
		return str.compareTo(other) < 0;
	}

	/* Return the maximum of the stored integers
	 */
	public int max() {
		if (aa >= bb && aa >= cc) {
			return aa;
		} else if (bb >= aa && bb >= cc) {
			return bb;
		} else {
			return cc;
		}
	}

	/* Return the middle value of the stored integers. If two numbers
	 * have the same value, return the lowest value. If all three numbers
	 * have the same value, return any. You must call the max() function
	 * to receive full credit
	 */
	public int mid() {
		if (max() == aa) {
			if (aa == bb) {
				return cc;
			} else if (aa == cc || bb > cc) {
				return bb;
			} else {
				return cc;
			}
		} else if (max() == bb) {
			if (bb == cc || aa > cc) {
				return aa;
			} else {
				return cc;
			}
		} else {
			if (cc == aa || aa > bb) {
				return aa;
			} else {
				return bb;
			}
		}

	}

	/* Return true if the stored numbers were provided in ascending
	 * order. They are considered ascending if each number is greater
	 * than or equal to the previous. To get full credit, do not use
	 * >= or =<; instead use < or > and invert them with !
	 */
	public boolean isAscending() {
		return !(aa > bb) && !(bb > cc);
	}

	public static void main(String[] args) {
		int exitCode = 0;

		Homework6 hw6 = new Homework6("Drive", 4, 5, 6);

		if (!hw6.isBefore("Cars")) {
			System.out.println("Pass 1");
		} else {
			System.out.println("Fail 1");
			exitCode += 1;
		}

		if (hw6.max() == 6) {
			System.out.println("Pass 2");
		} else {
			System.out.println("Fail 2");
			exitCode += 1;
		}

		if (hw6.mid() == 5) {
			System.out.println("Pass 3");
		} else {
			System.out.println("Fail 3");
			exitCode += 1;
		}

		hw6 = new Homework6("Drive", 4, 5, 5);
		if (hw6.mid() == 4) {
			System.out.println("Pass 4");
		} else {
			System.out.println("Fail 4");
			exitCode += 1;
		}

		if (hw6.isAscending()) {
			System.out.println("Pass 5");
		} else {
			System.out.println("Fail 5");
			exitCode += 1;
		}

		if (exitCode == 0) {
			System.out.println("All Pass");
		} else {
			System.out.println("Fail");
		}

		System.exit(exitCode);
	}

}
