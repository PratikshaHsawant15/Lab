package lab1;
import java.util.Scanner;
public class Armstrong 
{
	public static void main(String[] args) 
  {
     Scanner sc = new Scanner(System.in);
		 int n , num, rem, ans = 0;
		 System.out.println("Enter number");
		 n = sc.nextInt();
		 num = n;

		 while (num != 0)
		 {
		   rem = num % 10;
		   ans += Math.pow(rem, 3);
		   num /= 10;
		 }

		 if(ans == n)
     {
		   System.out.println(n + " is an Armstrong number.");
		 }
     else
     {
		   System.out.println(n + " is not an Armstrong number.");
     }
	}
}
