public class MiniBank
{
	double balance;
	String name = "";
	
	public MiniBank(double balance, String name)
	{
		this.balance = balance;
		this.name = name;
	}
	public String getInfo()
	{
		return name+": "+balance;
	}
	public void deposit(double moneyin)
	{
		balance += moneyin;
	}
}