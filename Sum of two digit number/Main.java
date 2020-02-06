import java.util.*;
class Main {
	public static void main (String[] args) 
    {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n1,f,l,s;
      n1=in.nextInt();
      f=n1/10;
      l=n1%10;
      s=f+l;
      System.out.println(s);
	}
}