package Application;

public class Client {

	public static void main(String args[]) {
		
		MBankFactory bankfactory = new MBankFactory();
		
		MSavingAcc mmsavingacc = bankfactory.getNewSavingAcc(1098765432, "VAIBHAVI", 2000, true);
		
		System.out.println(mmsavingacc.getAccNo());
		System.out.println(mmsavingacc.getAccNm());
		System.out.println(mmsavingacc.getAccBal());
		
		mmsavingacc.withdraw(700);
		mmsavingacc.toString();
		
		
		

		MCurrentAcc mmcurrentacc = bankfactory.getNewCurrentAcc(1234567890, "DARSHAN", 95000, 20000);
		
		System.out.println(mmcurrentacc.getAccNo());
		System.out.println(mmcurrentacc.getAccNm());
		System.out.println(mmcurrentacc.getAccBal());
		System.out.println(mmcurrentacc.getCreditLimit());
		
		
		
		
		mmcurrentacc.withdraw(7000);
		mmcurrentacc.toString();
		
		


	}
}
