package software;

 class Hu {
	
	
	static int a;
	
	static
	{
		System.out.println(a);
	}

}

class Pac
{
	public static void main(String[] args)
	{
		Hu h=new Hu();
	}
}

