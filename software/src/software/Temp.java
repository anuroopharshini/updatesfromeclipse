package software;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		animal a=new ant();
		a.m1();
	}

}

 class animal
{
	public void m1()
	{
		System.out.println("temp");
	}
}
 
 class ant extends animal
 {
	 public void m1()
	 {
		System.out.println("temp1") ;
	 }
 }


