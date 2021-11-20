package nextgeneration;
import nineties.Phone;

public class Tab extends Mobile
{
public int price =  10000;
public static void main(String[] args)
{
Tab sp = new Tab();
sp.call();
sp.receive();
sp.sendSMS();

System.out.println(sp.price);


 

}