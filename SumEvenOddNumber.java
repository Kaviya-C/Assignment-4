import java.util.Scanner;
public class SumEvenOddNumber {

	public static void main(String[] args)
	{
		int number=0,evenNum=0,oddNum=0;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter  number of integers that u want: ");
		int range=input.nextInt();
		
		for(int start=1;start<=range;start++)
		{
			System.out.print("Enter any number: ");
			number=input.nextInt();
			if(number%2==0)
				evenNum+=number;
			
			else
				oddNum+=number;
		}
			System.out.println("sum of even numbers: "+evenNum);
			System.out.println("sum of odd numbers: "+oddNum);
			 input.close();
	}
	

	}



