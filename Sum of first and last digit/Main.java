import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner S= new Scanner(System.in);
      int n,f,l,s,t,c=0,m=1;
      n = S.nextInt();
      t=n;
      l=n%10;
      
      while(t>0)
      {
        t=t/10;
        c++;
      }
      //System.out.println(c);
      for(int i=1;i<c;i++)
        m=m*10;
      //System.out.println(m);
      f=n/m;
      //System.out.println(f);
      s=f+l;
      System.out.println(s);
      
	}
}