package MultipleConstructer;

public class Testacc {
public static void main(String []args) {
	Acco a= new Acco();
    a.setAccNo("2300045600789");
    a.setAccType("saving");
    a.setBal(285948.4);
    System.out.println("Acont no : "+a.getAccNo());
    System.out.println("a/c type  : "+a.getAccType());
    System.out.println("Balance  : "+a.getBal());
    
    int wdr =12000; 
    a.withdrawal(wdr);
    System.out.println("withdral : "+wdr+" currnt bal : "+a.getBal());
    int depo=32000;
    a.deposit(depo);
    System.out.println("deposit : " +depo+ " new balance : "+a.getBal());
   
    
   System.out.println("Balance : "+a.getBal());
   a.withdrawal(26300);
   System.out.println("Balance : "+a.getBal()); 
}   
}

 


