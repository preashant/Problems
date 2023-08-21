package Problems;

public class DecimalToHexadecimal {
	public static void main(String[] args) {
		int num =31;

		while (num > 0) {
			int mod = num % 16;
			char ch = getDigitToHex(mod);
			System.out.println(ch);
		}

	}

	public static char getDigitToHex(int mod) {
        switch (mod) {
		case 1: return '1';
		case 2: return '2';
		case 3: return '3';
		case 4: return '4';
		case 5: return '5';
		case 6: return '6';
		case 7: return '7';
		case 8: return '8';
		case 9: return '9';
		case 10: return 'A';
		case 11: return 'B';
		case 12: return 'C';
		case 13: return 'D';
		case 14: return 'E';
		case 15: return 'F';
        }
		return '0';
        
	}
}
