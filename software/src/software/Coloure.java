package software;

  enum Color {

	Red(10),Green(20),Orange(30);
	
	
	int price;
	
	Color(int price)
	{
		this.price=price;
		
	}
	public int getPrice()
	{
		return price;
	}

}


class Coloure
{
	public static void main(String[] args)
	{
		Color[] c=Color.values();
	
		
		for(Color c1:c)
		{
			System.out.println(c1+" "+c1.getPrice());
		}
		
	}
	
}
