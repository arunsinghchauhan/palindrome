import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		
		//reverse check of digits/numbers.
		int rem,rev=0;
		System.out.println("Enter The number to reverse: ");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int temp=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		System.out.println("The reverse of the number is :"+rev);
		
		if(temp==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		
		
		//reverse check of alphabets.
		
		
	}

}
