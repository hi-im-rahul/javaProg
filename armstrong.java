package june30;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter no.");
		int n = scn.nextInt();
		boolean ans = IsArmstrong(n);
		System.out.println(ans);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		PrintArmstrong(n1,n2);
	}

	public static boolean IsArmstrong(int n) {
		int nod = 0, temp = n, temp1 = n, num = 0;
		while (temp != 0) {
			temp = temp / 10;
			nod++;
		}
		while (temp1 != 0) {
			int rem = temp1 % 10;
			temp1 = temp1 / 10;
			num = num + (int) Math.pow(rem, nod);
		}
		if (num == n)
			return true;
		else
			return false;
	}
	public static void PrintArmstrong(int n1,int n2)
	{
		for(int i=n1;i<=n2;i++)
		{
			boolean ans=IsArmstrong(i);
			if(ans)
				System.out.println(i);
		}
	}
}
