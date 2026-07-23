import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scale = sc.nextInt();
		
		char[][] lines = {
				{'*', 'x', '*'}, // the first element is an array
				{' ', 'x', 'x'}, // the second element is an array
				{'*', ' ', '*'}  // the third element is an array.
		}; // array of arrays == 2D array. each element of the array is an array.
		
		for (int i=0;i<lines.length;i++) {
			String s = buildString(lines[i],scale);
			printScaledLine(s,scale);
		}
	}

	private static void printScaledLine(String s, int scale) {
		for (int i=0;i<scale;i++) {
			System.out.println(s);
		}
		
	}

	private static String buildString(char[] line, int scale) {
		String s = "";
		for (int i=0;i<line.length;i++) {
			s += scaleCharacter(line[i],scale);
		}
		return s;
	}

	private static String scaleCharacter(char c, int scale) {
		// TODO Auto-generated method stub
		String s = "";
		
		for (int i=0;i<scale;i++) {
			s+=c;
		}
		return s;
	}

}
