package Exercise1_14;

public class PrimeNumber1To100 {
public static void main(String[]args) {
	int n,s,y,z;
	n=s;
	
	
	for(int n=2;n<=100;n++)
	{
		z=0;
		y=2;
		
		while(y<=n)
		{
			if(n%y==0)
			{
				z=1;
				break;
			}
			y++;
		}
		if(z==0)
		{
			System.out.println(n);
		}
		
	}
	
	
}
}
