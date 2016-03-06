public class Table
{
	int row;
	int column;
	public Table(int r, int c)
	{
		row = r;
		column = c;
	}
	public void printDrawBox()
	{
		for(int i = 1; i <= column;i++)
		{
			for(int j = 1; j <= row;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}