public class Generic_print {
	 public static <T> void print(T[] input) {
		    for (T t : input)
		      System.out.print(" "+t);
		    System.out.println();
		  }
		  public static void main(String args[]) 
		  { Integer[] Int = { 1, 2 };
		    Float[] f = { (float) 1.0,(float) 2.0 };
		    Character[] Char = { 'A','B'};
		    print(Int);
		    print(f);
		    print(Char); 
		  } 
}
