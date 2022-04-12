package Exercise1_14;

public class FindFactorial {
public static void main(String[]args) {
	int x=1;
	int y=1;
	while(x<=10) {
		y=x*y;
		System.out.println(y);
		x++;
	}
}
}
