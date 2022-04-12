package StringsPractice;

public class Reverse2Exercise {
public static void main(String[]args) {
	String b= "vijay chauhan";
	String[] b1 = b.split(" ");
	
	for(String b2:b1) {
	
		for(int i = b2.length()-1;i>=0;i--) {
			System.out.print(b2.charAt(i));
	}
		System.out.print(" ");
}
}
}
