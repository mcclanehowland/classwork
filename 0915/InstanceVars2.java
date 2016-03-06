public class InstanceVars2
{
    String userName = "default";
    int num1 = 8, num2 = 3; 
    int answer;
 
 
    public void add()
    {
        answer = num1 + num2;
    }
 
    public void printNum1()
    {
        System.out.println(num1);
    }
 
 
    public void print()
    {
        System.out.println(answer);
    }
 
}