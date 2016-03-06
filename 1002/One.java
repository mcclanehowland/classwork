public class One
{
	int side, area;
	
	public One()
	{
		side = 0;
	}
	public One(int side)
	{
		this.side = side;
	}
	public void printSquare()
	{
		area = side * side;
		System.out.println("the area is: "+area);
	}
	public void printSquare(int side)
	{
		this.side = side;
		area = side * side;
		System.out.println("the area is: "+area);
	}
}