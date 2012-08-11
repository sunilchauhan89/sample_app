
public class Thousands {
	int notes;
	FHundreds next;
	
	Thousands(int n){
		notes=n;
	}
	
	void addNext(FHundreds F){
		next=F;
	}

	public boolean withdraw(int amount) {
		// TODO Auto-generated method stub
		int r=amount/1000;
		int q=amount-r*1000;
		
		if(notes>=r)
		{
			if(q!=0)
			{
				if(next.withdraw(q))
				{
					System.out.println("1000 Notes : "+ r );
					notes-=r;
					return true;
				}
			}
			else{
				System.out.println("1000 Notes : "+ r );
				notes-=r;
				return true;
			}
		}
		else{
			q+=(r-notes)*1000;
			if(next.withdraw(q)){
				System.out.println("1000 Notes:" + notes);
				notes=0;
				return true;
			}
		}
		return false;
	}

	
}
