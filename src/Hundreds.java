
public class Hundreds {
	int notes;
	Fifty next;
	
	Hundreds(int n){
		notes=n;
	}
	

	void addNext(Fifty f){
		next=f;
	}


	public boolean withdraw(int amount) {
		// TODO Auto-generated method stub
		int r=amount/100;
		int q=amount-r*100;
		
		if(notes>=r)
		{
			if(q!=0)
			{
				if(next.withdraw(q))
				{
					System.out.println("100 Notes : "+ r );
					notes-=r;
					return true;
				}
			}
			else{
				System.out.println("100 Notes : "+ r );
				notes-=r;
				return true;
			}
		}
		else{
			q+=(r-notes)*100;
			if(next.withdraw(q)){
				System.out.println("100 Notes:" + notes);
				notes=0;
				return true;
			}
		}
		return false;
	}
}
