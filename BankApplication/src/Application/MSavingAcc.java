package Application;


import Framework.SavingAcc;

public class MSavingAcc extends SavingAcc{
	

	private static final float MINBAL = 0;
	public MSavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal,isSalaried);
		// TODO Auto-generated constructor stub
	}
	public static float getMinbal() {
		return MINBAL;
	}
	@Override
	public void withdraw(float accBal) {
		// TODO Auto-generated method stub
		System.out.println("Dear Saving User Your Withdraw Amount Is" + accBal);
	}
	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	

}
