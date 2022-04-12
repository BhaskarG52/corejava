package testcallingmethod;

public class AddReturnNewMethod {
public static void main(String[]args) {
	int i = add();
	if(i>0) {
		System.out.println(i+" hello");
	}else {
	System.out.println("ulternate");
}}
public static int add() {
	int x = 90;
	int y = 40;
	int z = x+y;
	if(z<100) {
	return 1;}
	return 0;
}
}
