package testcallingmethod;

public class MultiplyReturnMethod {
public static void main(String[]args) {
	int a = multi();
	if(a<0) {
		System.out.println("khargon");
	}else {
		System.out.println("indore");
	}
	
}
public static int multi() {
	int y = 12;
	int x = 23;
	int z = y*x;
	if(z>=150) {
		return 0;
	}
	else {
	return 1;}
}
}
