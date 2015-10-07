
public class Collatz {

	public static void main(String[] args) {
		int startzahl = 765;
	    while(startzahl >1)
	    	if(startzahl%2==0){
	    		startzahl=startzahl/2;
	    	}
	    
	    
	    	else{startzahl=(startzahl*3)+1;
	    	System.out.print(startzahl+" ");}

	
	    	}
	}


