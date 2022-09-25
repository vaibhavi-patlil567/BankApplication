package Framework;

public class SavingAcc extends BankAcc {
	
	private boolean isSalaried ;
	private static final float MINBAL=500;

	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float accBal) {
		System.out.println("Saving amount of " +accBal);
		//super.withdraw(1000);
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public static float getMinbal() {
		return MINBAL;
	}

}
