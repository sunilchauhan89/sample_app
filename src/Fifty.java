
public class Fifty {

	int notes;
	
	Fifty(int n){
		notes=n;
	}


	public boolean withdraw(int amount) {
		// TODO Auto-generated method stub
		int r=amount/50;
				
		if(notes>=r){
			System.out.println("50 Notes : "+ r );
			notes-=r;
			return true;
		}
		else{
			System.out.println("Sorry This much amount is not available");
			return false;
		}
	}
}
