package javaOOPs;


class BankAccount
{
	public int getamount() {
		return amount;
	}
	
	int otp = 1234;
	protected  int amount;
	public void setamount(int otp, int amount)
	{
		if(otp == this.otp)
		{
			this.amount  = amount;
		}
		
	}
	}
public class learnEncapsulation2 {

	public static void main(String[] args) {
		
		BankAccount obj  = new BankAccount();
		obj.setamount(1234, 100);
		System.out.println(obj.getamount());
		}

}
