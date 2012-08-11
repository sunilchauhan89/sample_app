
public class ATM {
	
	Thousands t;
	
	ATM(Thousands t){
		this.t =t;
	}
	
	void withdraw(int amount){
		
		if(amount%50!=0){
			System.out.println("Sorry You can withdraw minimum only in denominations of 50 .");
		}
		else{
			t.withdraw(amount);
		}
			
		
	}
	

}
