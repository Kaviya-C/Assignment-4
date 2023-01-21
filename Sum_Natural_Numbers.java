import java.util.Scanner;
public class Sum_Natural_Numbers {
	public static void main(String[] args) 
	{
		int start=0,sum=0,number=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the natural number from 1 to 10: ");
		number=input.nextInt();
		while (start<=number) 
		{
			sum+=start;//0+1//1+2//3+3//6+4//10+5//15+6//21+7//28+8//36+9//45+10-------55
			start++;//1     2       3    4      5   6  7  8   9   10   11---11<=10 condition false
		}
		System.out.println("The sum of first 10 natural numbers: "+sum);
		 input.close();
	}
	

}
