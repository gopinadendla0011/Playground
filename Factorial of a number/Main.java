import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
        // Type your code here
      Scanner S = new Scanner(System.in);
      int n,i,s=1;
      n = S.nextInt();
      for(i=1;i<=n;i++)
      {
        //if(n%i==0)
          //System.out.println(i);
        s = s*i;
      }
      System.out.println(s);
	}
}