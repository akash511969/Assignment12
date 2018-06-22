import java.util.ArrayList;
import java.util.Collections;
public class Generic_sort {
	public static <T> void sort (T[] input) {
		for (T t : input)
		      System.out.print(" "+t);
		    System.out.println();
	}
		public static void main(String[] args) {
			ArrayList<Integer> Int=new ArrayList<Integer>();
			Int.add(9);
			Int.add(8);
			Int.add(7);
			Int.add(6);
			Int.add(5);
			Int.add(4);
			Int.add(3);
			Int.add(2);
			Int.add(1);
			Int.add(0);
	     Collections.sort(Int);
	     System.out.println(Int);
		}
}





