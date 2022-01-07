package Main;

public class Main {

	public static void main(String[] args) {
		int y=0;
	    
	    for(int x=0;x<10;x++){
	        if( x%2 == 1) {
	            y = x+y; 
	        }
	        
	    }
	    
	      System.out.println(y+31);
	    }
	}