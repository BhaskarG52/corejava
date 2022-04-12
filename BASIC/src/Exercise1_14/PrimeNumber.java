package Exercise1_14;

public class PrimeNumber {
public static void main(String[]args) {
	int n,z,y;
	n=22;
	
	z=0;
	y=2;
	while(y<=n) {
		if(n%y==0)
		{
			z=1;
			break;
		}
		y++;
	}
	if(z==0)
	{
		System.out.println("number is prime number");
	}
	else {
		System.out.println("number is composite number");
	}
}
}
