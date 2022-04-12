package StringsPractice;

public class StringClass {
public static void main(String[]args) {
	String name = "vijay Dinanath chauhan ";
	//System.out.println("String Length- "+name.length());
//System.out.println("7th character is - "+name.charAt(7));
//System.out.println("Dina index is - "+name.indexOf("Dina"));
//System.out.println("First i position- "+name.indexOf("i"));
//System.out.println("last a position- "+name.lastIndexOf("a"));
System.out.println("a is replaced by b- "+name.replace("a", "b"));
System.out.println("All a is replaced by z- "+name.replaceAll("a", "z"));
System.out.println("All a is replaced by z- "+name.replaceAll("a(.)","Z"));
System.out.println("All a is replaced by Z- "+name.replaceAll("a(.*)","Z"));
//System.out.println("Chhota Vijay- "+name.toLowerCase());
//System.out.println("Bada Vijay- "+name.toUpperCase());
//System.out.println("Starts with vijay- "+name.startsWith("vijay"));
//System.out.println("Ends with han- " +name.endsWith("han"));

}
}