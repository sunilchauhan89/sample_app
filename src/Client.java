
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thousands thousandnote=new Thousands(10);
		FHundreds fhundredsnote=new FHundreds(20);
		Hundreds hundreds=new Hundreds(30);
		Fifty fifties=new Fifty(20);
		
		thousandnote.addNext(fhundredsnote);
		fhundredsnote.addNext(hundreds);
		hundreds.addNext(fifties);
		
		ATM atmmachine=new ATM(thousandnote);
		
		
		atmmachine.withdraw(24000);
		
	}

}
