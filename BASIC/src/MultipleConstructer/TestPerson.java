package MultipleConstructer;

public class TestPerson {
	public static void main(String []args) {
		Person p= new Person();
		
		
		p.setname("Mr.Bhaskar mishra");
		p.setage (25);
		p.setdob("22.10.98");
	    p.setadd("Nehru Nagar near Lig indore ");
	    System.out.println("Name :- "+p.getname());
	    System.out.println("Addrese :- "+p.getadd());
	    System.out.println("DOB :- "+p.getdob());
	    System.out.println("Age :- "+p.getage());
}
}