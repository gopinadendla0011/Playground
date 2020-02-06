import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner S= new Scanner(System.in);
      int n,s=0,t,r;
      n= S.nextInt();
      t=n;
      while(t>0)
      {
        r=t%10;
        t=t/10;
        s=s+r;
        
      }
      System.out.println(s);
        
	}
}