package nextgeneration;

import nineties.Phone;

public class  Mobile extends Phone
{
public int price = 6000;

public static void main(String[] args)
{

Mobile vivo = new Mobile();
vivo.call();
vivo.receive();

Phone phone = new Phone();
phone.call();

}
public void call ()
{
System.out.println("Outgoing Wireless");
}

public void  sendSMS()
{
	System.out.println("Send  SMS"); 
}
}



