public class Runner1
{
  public static void main (String [] args)
  {
    Test a = new Test();
    a.printList();
    System.out.println(a.searchLargest());
    a.searchAndReplace(5);
    a.printList();
    a.searchAndRemove(2);
    a.printList();
    a.scramble();
    a.printList();

  }
}
