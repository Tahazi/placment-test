
public class Question1 {
	
	public static void main(String[] args) {
		int entry;
		entry = 12345321;
		int number = entry;
		int reversedNum = 0;
		while (number != 0) {
		    reversedNum = reversedNum * 10 + number % 10;
		    number = number / 10;   
		}
		if (reversedNum == entry) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not Palindrome");
		}
	}
}
