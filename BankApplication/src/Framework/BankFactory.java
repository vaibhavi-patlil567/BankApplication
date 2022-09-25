package Framework;

public interface BankFactory {

	public abstract SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal,float creditLimit);

	
}
