package MultipleConstructer;

public class TestAuto {
	public static void main(String []args) {
		automob am = new automob();
	
	am.setcolour("WHITE");
    am.setgear(5);
    am.setmake("TATA");
    am.setspeed(50);
    System.out.println("colour "+am.getcolour());
    System.out.println("gear "+am.getgears());
    System.out.println("make By "+am.getmeke());
    System.out.println("Speed "+am.getspeed());
    am. changGear(2);
   am.brack();
}
}