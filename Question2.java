
public class Question2 {
	
	public static void swap(int[] T,int a, int b) {
		 int t = T[a];
		  T[a] = T[b];
		  T[b] = t;
		
	}
	
	public static void main(String[] args) {
		
		
		int[] array = {0,6,4,5,3,9,8,1,2,7}; // insorted tab
		int count = array.length;
		while (count>0) {
			for (int i=0 ; i < array.length -1 ; i++) {
				if (array[i]>array[i+1]) {
					swap(array,i,i+1);
				}
			}
			count--;
		}
		
		for (int i : array) {
			System.out.print(i);
		}
	}

}
