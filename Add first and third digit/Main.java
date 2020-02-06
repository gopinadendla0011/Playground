import java.util.Scanner;
class Main{
	public static void main (String[] args) 
    {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n,f,l,s;
      n = in.nextInt();
      f=n/100;
      l=n%10;
      s=f+l;
      System.out.println(s);
      
	}
}