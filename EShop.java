public class EShop
{
int price;
	private String profit = "30 %";
	private void profit()
	{
		System.out.println(profit);
	}
private EShop()
{
System.out.println("Dec 31 - Rs. 500/- offer");
}
public EShop(int price)
{
this();//Explicit call of constructor
this.price = price;
System.out.println("Your Bill is "+ price);
}
public static void main(String[] args)
{
EShop tv = new EShop(10000);
EShop fridge = new EShop(15000);
EShop enquiry = new EShop();
	tv.purchase(1000);
	fridge.purchase();
	tv.profit();
}
	//method overloading - Compile time polymorphism
	//Same method name different number of arguments OR 
	//with Different types of arguments in same class
	public void purchase(int discount)
	{
		System.out.println(discount);
	}
	public void purchase()
	{
		System.out.println("No discounts");
		
}
}