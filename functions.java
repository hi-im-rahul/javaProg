package june30;

public class functions {

	public static void main(String[] args) {
		int x=3,n=5;
		int pow=Power(x,n);
		int log=Log(pow,x);
	System.out.println(pow);
	System.out.println(log);

	}
	public static int Power(int x,int n)
	{int i=1,pow=1;
		while(i<=n)
		{
			 pow=pow*x;
			 i++;
		}
		return pow;
	}
public static int Log(int pow,int x)
{
int log=1;
while(Power(x,log)!=pow)
log++;
return log;
}

}
