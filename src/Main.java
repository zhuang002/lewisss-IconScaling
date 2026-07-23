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
		
		String[] s = {"", "", ""};
		
		for (int i=0;i<lines.length;i++) { // build each line, the ith line, totally lines.length lines
			for (int j=0;j<lines[0].length;j++) { // duplicate the jth character of ith line, totally line[i].length characters
				for (int k=0;k<scale;k++) {
					s[i] += lines[i][j]; // concat the ith line with the jth character of the original  ith line.
				}
			}
		}
		
		for (int i=0;i<lines.length;i++) {// print ith line, totally scale lines.
			for (int j=0;j<scale;j++) { // print each line scale times. 
				System.out.println(s[i]); // print the ith line.
			}
		}
		

	}

}
