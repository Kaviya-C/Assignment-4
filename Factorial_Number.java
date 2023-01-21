import java.util.Scanner;
public class Factorial_Number {
	public static void main(String[] args) 
	{
		int factorial=1 ,number=0,start=1;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the range value of the factorial number: ");
		number=input.nextInt();
		while(start<=number) //1<=5 true//2<=5 true 3<=5  4<=5  5<=5  6<=5false terminates the loop
		{
			factorial*=start;//1*1//1*2//2*3//6*4//24*5//120
			start++;//2     3         4     5
		}
		System.out.println("Factorial of "+number+" is = "+factorial);
		 input.close();
	}

}
