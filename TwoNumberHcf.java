import java.util.Scanner;
public class TwoNumberHcf {
	public static void main(String[] args) 
	{
		int number,newNum,hcf=0;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the number: ");
		number=input.nextInt();
		System.out.println("Enter one more number: ");
		newNum=input.nextInt();
		for(int start=1;start<=number||start<=newNum;start++) 
		{
			if (number%start==0 && newNum%start==0)
				hcf=start;
		}
		System.out.println("HCF is "+hcf);
		 input.close();
	}

}
