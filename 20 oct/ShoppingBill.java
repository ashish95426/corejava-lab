/*
 program:wap to give disconut 
 @author:Ashish kumar sahu
 @date:20/10/2022
*/
//declaring pcakage
import java.util.Scanner;
//declaring class
class ShoppingBill
{
 //method to calculate bill
  static void calcBill(int qty)
  {
     float price,discount,finalPrice;
	price=(540*qty);
	if(price>2000)
	{
	 discount=(price*10)/100;
	 finalPrice=price-discount;
	 System.out.println("your discount is "+discount);	
	 System.out.println(" amount before "+price);
	 System.out.println("total amount "+finalPrice);
	 
	}
	else
	  System.out.println("total bill is "+price);
	
	
  } 
  //end of method
   
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   //declaring variabels
   int qty;
   //taking inputs
   System.out.println("Enter the Quantity purchased");
   qty=sc.nextInt();
   //calling method to calculate bill
   calcBill(qty);
   
  }//end main
}//end of class