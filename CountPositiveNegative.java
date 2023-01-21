import java.util.Scanner;
public class CountPositiveNegative 
{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	int posCount=0,negCount=0,zeroCount=0;
	char choice;
	for(int start=1;start>0;start++)
	{
		System.out.print("Enter the number: ");
		int number=input.nextInt();
		
		if(number>0)
		
			posCount++;
		
		else if(number<0)
		
			negCount++;
		
		else
		
			zeroCount++;
		
		System.out.print("enter y to continue or n to stop..!");
		choice=input.next().charAt(0);
		if(choice=='n')
			break;
		else if(choice=='y')
			continue;
		
		 input.close();
	}
	
	System.out.println("positive count : "+posCount);
	System.out.println("negative count : "+negCount);
	System.out.println("zero count : "+zeroCount);
	
	}
}
