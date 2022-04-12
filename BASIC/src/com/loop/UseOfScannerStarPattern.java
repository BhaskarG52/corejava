package com.loop;

import java.util.Scanner;

public class UseOfScannerStarPattern {
	public static void main(String[]args) {
		
	
Scanner s = new Scanner(System.in);
System.out.println("Enter a nuber of row : ");
int rows = s.nextInt();
    for(int i=0;i<=rows-1;i++) {
      for(int j=0;j<i;j++) {
    	  System.out.print("");
      }
      for(int k=i;k<=rows-1;k++) {
    	  System.out.print("*"+" ");
      }
       System.out.println("");
    }
     for(int i=rows-1;i>0;i--) {
    	  for(int j=0;j<i;j++) {
    		  System.out.print("");
    	  }
    	  for(int k=i;k<=rows-1;k++) {
    		  System.out.print("*"+" ");
    	  }
    	  System.out.println("");
     }
      s.close();
    
	
    
}
}