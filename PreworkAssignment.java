import java.util.Scanner;

public class PreworkAssignment {

	Scanner sc = new Scanner(System.in);
	
	
//function to checkPalindrome
    public void checkPalindrome()  {
    	System.out.println("Enter the number to check for Palindrome\n");
    	int n = sc.nextInt();
    	int r, sum=0,temp;
    	
    	temp =n; ///saving the number in a temporary variable
    	
    	while (n>0) {
    		r=n%10; ///getting remainder
    		sum= (sum*10)+r;
    		n=n/10;
    	}
    		if (temp==sum)
    			 System.out.println("palindrome number\n ");    
    		  else    
    		   System.out.println("not palindrome\n");    
    	
   }
    
    //function to printPattern
    public void printPattern() {
    	
    	System.out.println("Enter the number of rows\n");
    	int r = sc.nextInt();
    	for (int i= r-1; i>=0 ; i--)  //outer loop 
    	{  
    	for (int j=0; j<=i; j++)  //prints star 
    	{  
    	System.out.print("*");  
    	}  
    	System.out.println();  //enters the cursor in the next line after printing
    	}  
     }
       
    //function to check no is prime or not

     public void checkPrimeNumber() {
    	 System.out.print("Enter a number : ");  
         int num = sc.nextInt();  
         int cnt=0;
         
         if(num==0||num==1){  
        	   System.out.println(num+" is not prime number");      
        	  }
         else{  
         for (int i=2; i<num; i++) {
        	 if (num%i==0) {
        		 cnt++;
        	 }
         }
         
         if (cnt>0)
        	 System.out.println(num + " is not a prime number\n");
         else
        	 System.out.println(num + " is a prime number\n");
         }          
     }

       // function to print Fibonnacci Series

       public void printFibonacciSeries() {
    	   
        int n1 = 0; //initialize the first and second value as 0,1 respectively.
        int n2 = 1;
        int j,n3;
        System.out.println("Enter the count of number in a series\n");
    	int f = sc.nextInt();
    	System.out.print(n1+" "+n2);//printing 0 and 1
    	/* for(j=2;j<f;++j)    
    	 {    
    	  f=n1+n2;    
    	  System.out.print(" "+f);    
    	  n1=n2;    
    	  n2=f;    
    	 }  */  
    	    	
    	 if(f>0){    
             n3 = n1 + n2;    
             n1 = n2;    
             n2 = n3;    
             System.out.print(" "+n3);   
             f--;   
         }    
       }
	
     //main method which contains switch and do while loop

       public static void main(String[] args) {

    	   PreworkAssignment obj = new PreworkAssignment();
           int choice;
           Scanner sc = new Scanner(System.in);

 do {

 System.out.println("\nEnter your choice from below list.\n" + "1. Find palindrome of number.\n"

 + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

 + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

 System.out.println();

 choice = sc.nextInt();

 switch (choice) {
 
case 0:
choice = 0;
break;


case 1: {
obj.checkPalindrome();
}

break;

case 2: {
obj.printPattern();
}
break;

case 3: {
obj.checkPrimeNumber();
}
break;

case 4: {
obj.printFibonacciSeries();
}
break;

default:
System.out.println("Invalid choice. Enter a valid no.\n");
}

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();
}
	
	
}
