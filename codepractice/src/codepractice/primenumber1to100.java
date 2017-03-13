package codepractice;

public class primenumber1to100 {

	
	
	
public static void main(String[] args){
	int i,j;
	boolean prime=true;
	
	for(i=1;i<100;i++){
		prime=true;
		
		for(j=2;j<i;j++){
			if(i%j==0){
				prime=false;
			}
	
		}
			
	if(prime){
		System.out.print(i+" ");
	}
	
	
	}

		
	}	
	
}
