/*Complete the code segment to check whether the number is an Armstrong number or not.

Armstrong Number:

A positive number is called an Armstrong number if it is equal to the sum of cubes of its digits for example 153 = 13+53+33, 370, 371, 407, etc. */


import java.util.Scanner;
public class four {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
       int result=0;
       int temp=n;
       int rem;
       while(temp!=0){
         rem=temp%10;
         result+=Math.pow(rem,3);
         temp=temp/10;
        }
      if(result==n)
        System.out.print("1");
      else 
        System.out.print("0");
        
    }
}