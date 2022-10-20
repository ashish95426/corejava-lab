/*
 program:wap to oldest and youngest age 
 @author:Ashish kumar sahu
 @date:20/10/2022
*/
//declaring pcakage
import java.util.Scanner;
//declaring class
class Age
{
 //method to finf grater age
  static void greaterAge(int a1,int a2,int a3)
  {
     
	if((a1>a2)&&(a1>a3))
	{
	  System.out.println("the oldest person age is  "+a1);
	  
	    if(a2>a3)
	     System.out.println("the youngest person age is  "+a3);
	       else
		     System.out.println("the youngest person age is  "+a2);
	  
	}
	else if((a2>a1)&&(a2>a3))
	{
	  System.out.println("the oldest person age is  "+a2);
	  
	    if(a1>a3)
	     System.out.println("the youngest person age is  "+a3);
	       else
		     System.out.println("the youngest person age is  "+a1);
	  
	}
	else
	
	{
	  System.out.println("the oldest person age is  "+a3);
	  
	    if(a1>a2)
	     System.out.println("the youngest person age is  "+a2);
	       else
		     System.out.println("the youngest person age is  "+a1);
	  
	}
	//end of nested if
  } 
  //end of method
   
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   //declaring variabels
   int age1,age2,age3;
   //taking inputs
   System.out.println("Enter the first person age");
   age1=sc.nextInt();
   System.out.println("Enter the second person age");
   age2=sc.nextInt();
   System.out.println("Enter the third person age");
   age3=sc.nextInt();
   //calling method to find greater age
   greaterAge(age1,age2,age3);
   
  }//end main
}//end of class