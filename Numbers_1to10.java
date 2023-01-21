import java.util.Scanner;
public class Numbers_1to10 {
	public static void main(String[] args)
	{
		int number=0,start=1;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the range of values: ");
		number=input.nextInt();
		while(start<=number) //1<=10 2<=10 3<=10.....11<=10 condition false loop terminates
		{
			System.out.println(start);
			start++;//1 then 2 then 3 then 4 then 5.....11 
		}
		 input.close();
		
		
	}
}
