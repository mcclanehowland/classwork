public class Selection
{
	public String zipCode1(int zip)
	{
		if(zip == 94040)
		{
			return "Mountain View";
		}
		else if(zip == 94115)
		{
			return "San Francisco";
		}
		else if(zip == 95051)
		{
			return "Santa Clara";
		}
		return "Not Valid";
	}
	public String zipCode2(int zip)
	{
		String city = "";
		switch(zip)
		{
			case 95129:
				city = "San Jose";
				break;
			case 94607:
				city = "Oakland";
				break;
			case 95035:
				city = "Milpitas";
				break;
			default:
				city = "Not Valid";
				break;
		}
		return city;
	}
	public String zipCode3(int zip)
	{
		if(zip == 94301)
			return "Palo Alto";
		if(zip == 94086)
			return "Sunnyvale";
		if(zip == 95037)
			return "Morgan Hill";
		
		return "Not Valid";
			

	}
}