public class Menu
{
	public String selectMenu1(int num)
	{
		if(num == 1)
			return "A";
		else if(num == 2)
			return "B";
		else if(num == 3)
			return "C";
	
		return "not valid";
	}
	public  String selectMenu2(int num)
	{
		switch(num)
		{
			case 1:
				return "X";
			
			case 2:
				return "Y";
			
			case 3:
				return "Z";
			
			default:
				return "not valid";
			
		}
	}
}