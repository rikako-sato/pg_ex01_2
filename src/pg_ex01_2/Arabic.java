package pg_ex01_2;

public class Arabic {

	public static String toRoman(int val) {
		if (val <= 0) {
			return "変換できません";
		}
		if (val >= 21) {
			return "変換できません";
		}

		int x = val / 10;
		int i = val % 10;

		String roman = "";

		roman += repeat("X", x);

		if (i == 9) {
			roman += "IX";
		} else if (i == 4) {
			roman += "IV";
		} else {
			roman += repeat("V", i / 5);
			i %= 5;
			roman += repeat("I", i);
		}

		return roman;
	}

	private static String repeat(String str, int num) {
		String s = "";
		for (int i = 1; i <= num; i++) {
			s += str;
		}
		return s;
	}


}
