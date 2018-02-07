
public class Question3 {
	public static void main(String[] args) {
		String original;
		String reverse = ""; 
		original = "ajklsskja";
	      
	      for ( int i = original.length()-1 ; i >= 0 ; i-- ){
	    	  reverse = reverse + original.charAt(i);
	      }
	      System.out.println(reverse);
		}
	 
	}
