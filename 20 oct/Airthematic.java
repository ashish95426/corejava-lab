/*
 program:wap to give disconut 
 @author:Ashish kumar sahu
 @date:20/10/2022
*/
//declaring pcakage
import java.util.Scanner;
//declaring class
class Airthematic
{
 //method to find square
  static void square(float n1)
  {
   float sum;
   sum=n1*n1;  
   System.out.println("square of "+n1+" is "+sum);	
  } 
  //end of method
  //method to find cube
  static void cube(float n1)
  {
   float sum;
   sum=n1*n1*n1;  
   System.out.println("cube of "+n1+" is "+sum);	
  } 
  //end of method
  //method to check even or odd
  static void evenOdd(float n1)
  {
   if((n1%2)==0)  
    System.out.println(n1+"is even");
   else
    System.out.println(n1+"is odd");   
  } 
  //end of method
   
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   //declaring variabels
    float num1;
    int choice;
	System.out.println("Enter the number");
	num1=sc.nextFloat();
	
	//menu
	System.out.println("1. square");
	System.out.println("2. cube");
	System.out.println("3. even/odd");
	System.out.println("4. exit");
	
	
	System.out.println("Enter your choice");
	choice=sc.nextInt();
	//start switch
	 switch(choice)
	  {
	   case 1:square(num1);
	      break;
	   case 2:cube(num1);
	      break;
	   case 3:evenOdd(num1);
	      break;
	   case 4:System.exit(0);
	      break;
	   default:System.out.println("wrong input");
	  
	  }//end switch
	
   
   
  }//end main
}//end of class