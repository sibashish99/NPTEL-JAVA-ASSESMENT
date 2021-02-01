import java.util.Scanner;
public class Fibonacci { 

public static void main(String args[]) { 
	 Scanner sc = new Scanner(System.in);
	 int n=sc.nextInt(); 
     System.out.println(fib(n));                
                                   
} 
static int fib(int n) {
   int j=n-1;
   if(j==0)
      return 0;
   if(j==1)
      return 1;
   else
      return (fib(n-1)+fib(n-2));
 }
}