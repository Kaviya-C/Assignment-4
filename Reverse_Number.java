import java.util.Scanner;
public class Reverse_Number {
	public static void main(String[] args) 
	{
		int reverseNumber=0,number=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number which you want to reverse");//9876
		number=input.nextInt();//9876
		while(number!=0)//9876!=0 true//987!=0 true
		{
			reverseNumber=reverseNumber*10;//0*10//6*10==60
			reverseNumber+=number%10;//0+9876%10==6//60+987%10==60+7 67
			number=number/10;//9876/10==987//987/10
			
		}
		System.out.println("reverse number: "+reverseNumber);
		
		 input.close();
	}
	

}
