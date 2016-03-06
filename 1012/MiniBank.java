public class MiniBank
{
	double balance;
	public MiniBank(double balance)
	{
		this.balance = balance;
	}
	public void printBalance()
	{
		System.out.println("balance: "+balance);
	}
	public void withdraw(double moneyOut)
	{
		balance = balance - moneyOut;
		printBalance();
	}
	public void deposit(double moneyIn)
	{
		balance = balance + moneyIn;
		printBalance();
	}
	
}