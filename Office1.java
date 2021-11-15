package tamilnadu.tamilnadu;

public class Office1
{
	int ta =100;// default package level access
public static void main(String[] args)
{
Office1 worker1 = new Office1();
System.out.println("Check");
	worker1.giveSnacks();
	worker1.work();

}
 void giveSnacks()//Default package level access
{
	System.out.println("Snacks");
}
	public void work()
	{
		System.out.println("Work");
}

}