package Exercise1_14;

public class ReverseNumberAndPalindrome {
public static void main(String[]args) {
	int n=1208;
	int r;
	int s=0;
	int n1=n;
	while(n>0) {
		
		r=n%10;
		s=(s*10)+r;
		n=n/10;
		
	}
	System.out.println("Reverse:"+s);
	if(n1==s) {
		System.out.println("Number is palindrome");
	}else {
		System.out.println("Number is not palindrome");
	}
}
}
