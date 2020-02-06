import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner input= new Scanner(System.in);
    int num=input.nextInt();
    int digit1=num/100;
    int digit2=(num/10)%10;
    int digit3=num%10;
    int num2=(digit3*100)+(digit2*10)+digit1;
    System.out.println(num2);
  }
}