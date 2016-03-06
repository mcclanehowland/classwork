package Box;

public class AccountManager
{
    private Account a;
    public AccountManager(String name, int b, double c)
    {
        a = new Account(b,c,name);
    }
    public void printInfo()
    {
        System.out.println(a.toString());
    }
    
}
