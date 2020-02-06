import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n,t,r,p,S=0;
      n = s.nextInt();
      t=n;
      while(t>0)
      {
        r=t%10;
        p = 1;
        for(int i=1;i<=r;i++)
          p = p*i;
        S=S+p;
        t=t/10;
      }
      if(S==n)
        System.out.println("Yes");
      else
        System.out.println("No");
                 
	}
}