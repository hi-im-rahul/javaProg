package june30;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int ans = 0;
		do
		{
		System.out.println("Enter the operation");
		char ch = scn.next().charAt(0);
		if(ch=='x'||ch=='X')
        	return;
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        if(ch=='+')
        ans=n1+n2;
        else if(ch=='-')
        	ans=n1-n2;
        else if(ch=='*')
        	ans=n1*n2;
        else if(ch=='/')
        	ans=n1/n2;
        else if(ch=='%')
        	ans=n1%n2;
        else 
        { System.out.println("Invalid input");
        return;}
        System.out.println(ans);
		}
		while(true);
	}

}
