package HelloWorld;

public class Main {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	      
	      boolean[] chptList = new boolean[16]; // Valid chapters are 1-15. 1 means include, 0 exclude. Element 0 unused. 
	      int includeChpt;
	      int i, j;
	      
	      // Get the chapter selections
	      for (i = 1; i <= 15; ++i) {
	         includeChpt = scnr.nextInt(); 
	         if (includeChpt==1) {
	            chptList[i] = true;
	         }
	         else {
	            chptList[i] = false;
	         }
	      }
	      
	      int go=0;
	      int stop=0;
	      for (int c=1;c<chptList.length; c++){
	         if (chptList[c]){
	            if (go==0){
	               go=c;}
	            stop=c;
	         }
	         else{
	            if (go!=0){
	               if (stop-go>=2){
	                  System.out.print(go + "-" + stop + " ");
	               }
	               else{
	                  for (int u=go; u<=stop; u++){
	                     System.out.print(u + " ");
	                  }
	               }
	               go=0;
	            }
	         }
	      }
	      if (go!= 0 && stop!=0){
	         if (stop-go>=2){
	            System.out.print(go + "-" + stop + " ");
	         }
	         else{
	            for (int u=go; u<=stop; u++){
	               System.out.print(u + " ");
	            }
	         }
	      }
	      if (go==0 && stop==0){
	         System.out.print("None ");
	      }
	      System.out.println();      

}
}
