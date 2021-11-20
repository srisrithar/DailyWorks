package nextgeneration;
import nineties.Phone;

public class SmartPhone extends Mobile
{
public int price =  10000;
public static void main(String[] args)
{
SmartPhone sp = new SmartPhone();
sp.call();
sp.receive();
sp.sendSMS();

System.out.println(sp.price);


}

}