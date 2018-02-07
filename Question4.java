import java.util.ArrayList;

public class Question4 {
	public void printList(ArrayList<Integer> list) {
		StringBuilder stringToPrint = new StringBuilder().append("|");
		for (Integer i : list) {
			stringToPrint.append(i + "|");
		}
	}
	public void addTwoNumberFrom(int i) {
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			list1.add(i);
			list2.add(list1.get(list1.size()));
		}
		
		
	}
}
