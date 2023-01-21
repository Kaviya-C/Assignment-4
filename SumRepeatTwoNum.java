import java.util.Scanner;
public class SumRepeatTwoNum {
	public static void main(String[] args) 
	{
		int num1=0,num2=0,result=0;
		String choice;
		Scanner input=new Scanner(System.in);
		do
		{
			System.out.print("Enter the number1: ");
			num1=input.nextInt();
			System.out.print("Enter the number2: ");
			num2=input.nextInt();
			result=result+num1+num2;
			System.out.print("Press yes for continue and no for stop..!");
			choice=input.next();
			
		}while(choice.equalsIgnoreCase("yes"));
		System.out.println("sum of the numbers: "+result);

		 input.close();
	}
	

}
