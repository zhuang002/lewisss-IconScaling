import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scale = sc.nextInt();
		
		char[] line0 = new char[3];
		char[] line1 = new char[3];
		char[] line2 = new char[3];
		
		line0[0] = '*';
		line0[1] = 'x';
		line0[2] = '*';
		
		line1[0] = ' ';
		line1[1] = 'x';
		line1[2] = 'x';
		
		line2[0] = '*';
		line2[1] = ' ';
		line2[2] = '*';
		
		String s0 = "";
		for (int i=0;i<scale;i++) {
			s0+=line0[0];
		}
		for (int i=0;i<scale;i++) {
			s0+=line0[1];
		}
		for (int i=0;i<scale;i++) {
			s0+=line0[2];
		}
		
		String s1 = "";
		for (int i=0;i<scale;i++) {
			s1+=line1[0];
		}
		for (int i=0;i<scale;i++) {
			s1+=line1[1];
		}
		for (int i=0;i<scale;i++) {
			s1+=line1[2];
		}
		
		String s2 = "";
		for (int i=0;i<scale;i++) {
			s2+=line2[0];
		}
		for (int i=0;i<scale;i++) {
			s2+=line2[1];
		}
		for (int i=0;i<scale;i++) {
			s2+=line2[2];
		}
		
		for (int i=0;i<3;i++) {
			System.out.println(s0);
		}
		
		for (int i=0;i<3;i++) {
			System.out.println(s1);
		}
		
		for (int i=0;i<3;i++) {
			System.out.println(s2);
		}
		
		

	}

}
