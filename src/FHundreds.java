
public class FHundreds {
	int notes;
	Hundreds next;
	
	FHundreds(int n){
		notes=n;
	}
	
	void addNext(Hundreds h){
		next=h;
	}

	public boolean withdraw(int amount) {
		// TODO Auto-generated method stub
		int r=amount/500;
		int q=amount-r*500;
		
		if(notes>=r)
		{
			if(q!=0)
			{
				if(next.withdraw(q))
				{
					System.out.println("500 Notes : "+ r );
					notes-=r;
					return true;
				}
			}
			else{
				System.out.println("500 Notes : "+ r );
				notes-=r;
				return true;
			}
		}
		else{
			q+=(r-notes)*500;
			if(next.withdraw(q)){
				System.out.println("500 Notes:" + notes);
				notes=0;
				return true;
			}
		}
		return false;
	}

}
