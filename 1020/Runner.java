public class Runner
{
	public static void main(String[] args)
	{
		MiniBank m = new MiniBank(0,"Heather");
		String info1 = m.getInfo();
		System.out.println(info1);
		m.deposit(100.01);
		String info2 = m.getInfo();
		System.out.println(info2);
	}
}