import java.util.Scanner; 
import java.util.concurrent.*; 

public class Cronos {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner myObj = new Scanner(System.in);  
		TimeUnit time = TimeUnit.SECONDS;
		
	    System.out.println("Horas    ");
	    int hours = myObj.nextInt(); 
	    System.out.println("Minutos    ");
	    int minutes = myObj.nextInt(); 
	    System.out.println("Segundos    ");
	    int seconds = myObj.nextInt();
	    long sec = Long.valueOf(seconds);
	    
	    for(int i=hours; i>=0; i--) {
	    	for(int j=minutes; j>=0; j--) {
	    		if(j==0 && i>=0) {
	    			j= 59;
	    			i--;
	    		}
	    		else {
	    			
	    		}
	    		for(int k=59; k>=0; k--){
	    			time.sleep(1L);
	    			sec=sec-1;
	    			for(int l=seconds; l>=0; l--) {
	    				if(l==0) {
	    					System.out.println("HORAS:   "+ i+ "    MINUTOS:   "+j+"    SEGUNDOS:   "+k);
	    					seconds=0;
	    				}
	    				else {
		    				time.sleep(1L);
			    			sec=sec-1;
			    			int total = k+l;
			    			System.out.println("HORAS:   "+ i+ "    MINUTOS:   "+j+"    SEGUNDOS:   "+total);
	    				}
	    			}
	    		}
	    	}
	    }

	    
		
		

	}

}

