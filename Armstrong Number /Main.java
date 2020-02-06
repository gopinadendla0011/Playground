import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args)
    {
	   // Type your code here
      Scanner S = new Scanner(System.in);
      int n,i,t,c=0,r,m;
      double k, s=0;
      m = S.nextInt();
      t=m;
      n=m;
      while(t>0)
      {
        t=t/10;
        c++;
      }
      //System.out.println(c);
      while(n>0)
      {
        //if(n%i==0)
          //System.out.println(i);
        r=n%10;
        //System.out.println(r);
        k=Math.pow(r, c);
        s = s+k;
        //System.out.println(s);
        n=n/10;
          
      }
      //System.out.println(s);
      if(s==m)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
        
	}
}