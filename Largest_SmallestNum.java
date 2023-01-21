import java.util.Scanner;
public class Largest_SmallestNum {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int number;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		System.out.println("maximum "+max);
		System.out.println("minimum "+min);
		char choice;
		do
		{
			System.out.println("Enter the number: ");
			number=input.nextInt();
			if(number>max)//9>-2147483648 true 
				max=number;
			else if(number<min)//-8<2147483647 true
				min=number;
			System.out.println("Press y for continue and n for stop..!");
			choice=input.next().charAt(0);
		}while(choice=='y'||choice=='Y');
		System.out.println("Largest number: "+max);
		System.out.println("Smallest number: "+min);
	
		 input.close();
	}
}
