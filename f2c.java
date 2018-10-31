package june30;

public class f2c {

	public static void main(String[] args) {
		int minF=0;
		int maxF=300;
		int step=20;
		int tempC=0;
		for(int i=minF;i<=maxF;i=i+step)
		{
			tempC=(int)(5.0/9*(i-32));
			System.out.println(i+" "+tempC);
		}
	}

}
