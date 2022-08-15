
import java.util.Scanner;
  public class Main 
{ 
	  Scanner sc=new Scanner(System.in);
    //function to checkPalindrome
  public void checkPalindrome() 
  { Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
	  int num=n,rev=0,remainder;
    while(num!=0) 
    {
    	remainder=num%10;
    	rev=rev*10+remainder;
    	num=num/10;
    }
	if(rev==n) 
	{
		System.out.println(n +" Number is Palindrome");
	}
	else 
	{  System.out.println(n +"Number is not Palindrome");
		
	}
  }
 // printPattern
 public void printPattern()
 {
	 Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number");
	    int n=sc.nextInt();
	 for(int i=1;i<=n;i++) 
	 {for(int j=1;j<=n-i+1;j++) 
	 {
		 System.out.print("*");
	 }
	 System.out.println();
	 }
 }
 //checkPrimeNumber
 public void checkPrimeNumber() 
 {
	 Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number");
	    int n=sc.nextInt();int count=0;
	 for(int i=1;i<=n;i++) 
	 {
		 int number=n%i;
		 if(number==0) 
		 {
			 count++;
		 }
	 }
	 if(count>2) 
	 {
		 System.out.println("The Number Is PrimeNumber.");
	 }
	 else 
	 {
		 System.out.println("The Number Is Not PrimeNumber.");
	 }
 }
 //FibonacciSeries
 public void FibonacciSeries() 
 {
	 int n1=0,n2=1;
	 System.out.print(n1+""+n2);
	 Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number");
	    int n=sc.nextInt();;int n3;
	 for(int i=1;i<=n;i++) 
	 { n3=n1+n2;
	 n1=n2;
	 n2=n3;
	 System.out.print(n3);
		 
	 }
 }

 public static void main(String[]args) 
 {
	 Main obj=new Main();
	 int choice;
	 Scanner sc=new Scanner(System.in);
	 do 
	 {
		 System.out.println("Enter the choice from below list.\n"+"1.Find Palindrome Number.\n"+
		 		"2.PrintPattern for a given number.\n"+"3.check weather number is prime.\n"
				 +"4.print Fibonacci series.\n"+"ENTER 0 TO EXIT.\n");
				 System.out.println();
				 choice=sc.nextInt();
				 switch(choice) 
				 {
				 case 0:
					 break;
				 case 1:{
					 obj.checkPalindrome();
				 }
			     break;
				 case 2:
				 {obj.printPattern();
					 
				 }
				 break;
				 case 3:
				 {
					 obj.checkPrimeNumber();
				 }
				 break;
				 case 4:
				 {
					 obj.FibonacciSeries();
				 }
				 break;
				 default:
					 System.out.println(" Invalid.Please Enter valid choice\n");
				 }
	             }while(choice!=0);
	              System.out.println("Exited succesfully!!!");
	              sc.close();			 
 }
}


