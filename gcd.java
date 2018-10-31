package june30;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the nos.");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int gc = GCD(n1, n2);
		System.out.println(gc);
		System.out.println("Enter the nos.");
		int n3 = scn.nextInt();
		int n4 = scn.nextInt();
		int lc = LCM(n3, n4);
		System.out.println(lc);

	}

	public static int GCD(int n1, int n2) {
		while (n1 % n2 != 0) {
			int rem = n1 % n2;
			n1 = n2;
			n2 = rem;
		}
		return n2;
	}

	public static int LCM(int n3, int n4) {
		int lc = n3 * n4 / GCD(n3, n4);
		return lc;
	}
}
