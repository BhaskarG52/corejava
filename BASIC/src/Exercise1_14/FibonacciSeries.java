package Exercise1_14;

public class FibonacciSeries {
public static void main(String[]args) {
	int x=1;
	int y=1;
	int z;
	while(x<=45) {
		System.out.println(y);
		z=x+y;
		x=y;
		y=z;
	}
}
}
