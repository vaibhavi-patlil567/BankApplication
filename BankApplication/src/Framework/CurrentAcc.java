package Framework;

public class CurrentAcc extends BankAcc{

	

	private final float creditLimit;
	
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = 0;
	
		// TODO Auto-generated constructor stub
	}

	public float getCreditLimit() {
		return creditLimit;
	}
	@Override
	public void withdraw(float accBal) {
	  System.out.print("account balaced is"+accBal);
		//super.withdraw(1200);
	}

	@Override
	public String toString() {
		return "CurrentAcc [getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

}
