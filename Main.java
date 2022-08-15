import java.util.Scanner;
  public class Main 
{  Scanner sc=new Scanner(System.in);
    //function to checkPalindrome
  public void checkPalindrome() 
  { int n=121,num=n,rev=0,remainder;
    while(num!=0) 
    {
    	remainder=num%10;
    	rev=rev*10+remainder;
    	num=num/10;
    }
	if(rev==n) 
	{
		System.out.println(n +"Number is Palindrome");
	}
	else 
	{  System.out.println(n +"Number is not Palindrome");
		
	}
  }  
    
}

