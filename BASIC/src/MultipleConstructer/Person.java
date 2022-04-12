package MultipleConstructer;


	

	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class Person {
	  private String name = null;
	private String add = null;
	private Date d =new Date();
	SimpleDateFormat f =new SimpleDateFormat("dd.MM.yy");
	String dob= f.format(d);
	private int age =00;


	public String getadd() {
		return add;
	}
	public void  setadd(String add ) {
		this.add = add;
	}
	public String getname (){
	return name ;	
		}
	public void setname (String name ) {
		this.name =name ;
	}
	public String getdob() {
		return dob;
	}
	public void setdob (String dob) {
		this.dob = dob;
	}
	public int getage (){
		return age;
		}
	public void setage(int age ) {
		this.age = age;
	}
	public static void Else() {

		}
	}		
		
		
		


	

