package StringsPractice;

public class CountingOfString {
	public static void main(String[]args) {
		
String s = "emailaddress";
int x=0;
for(int i=0;i<s.length();i++) {
	char c = s.charAt(i);
	String k = String.valueOf(c);
	if(k.matches("d")) {
		x++;
	}
	
}
   System.out.println("Number of 'd' type alphabate is : " +x);
}
}
