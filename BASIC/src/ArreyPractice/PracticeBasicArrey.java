package ArreyPractice;

public class PracticeBasicArrey {
public static void main(String[]args) {
	int[] table = {12,23,36,35,34,65,69,85,74,56,24,259};
	
	//Access 7th element of table..
	
	int element=table[6];
	System.out.println("7th element is : "+element);
	
	
  //get the size of an arrey..
   
	int size = table.length;
	System.out.println("Size is : "+size);
	
	// Applying for loop condition..
//	int i = table[11];
	int i;
	for(i=0;i<table.length;i++) {
		System.out.println(table[i]);
	}
}

}
