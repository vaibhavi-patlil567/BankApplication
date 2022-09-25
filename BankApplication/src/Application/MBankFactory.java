package Application;
import Framework.BankFactory;

public class MBankFactory implements BankFactory{

	@Override
	public MSavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
		
		MSavingAcc mmsavingacc = new MSavingAcc(AccNo,accNm,accBal,isSalaried);
		return mmsavingacc;
	}

	@Override
	public MCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		
		MCurrentAcc mmCurrentacc = new MCurrentAcc(accNo, accNm, accBal, creditLimit);
		return mmCurrentacc;
	}

	
	

}