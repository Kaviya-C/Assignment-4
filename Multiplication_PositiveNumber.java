import java.util.Scanner;
public class Multiplication_PositiveNumber {
	public static void main(String[] args) 
	{
		int positiveNum=0,col=0,row=0,start=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the positive integer: ");
		positiveNum=input.nextInt();

		/*for(row=2;row<=positiveNum;row++) {//2<=5 

			for(col=1;col<=10;col++)
			{
				System.out.println(row+" * "+col+" = "+col*row);//1*2//2*2 //3*2/4*2/5*2/6*2/7*2/8*2/9*2/10*2
			}
			System.out.println("\n------Next Tables-----\n");
		}
		input.close();
	}
	
}*/

		//above for loop executes the tables from 2 to user entered numbers 
		//example if user entered as 4 mean it print 2 table 3 table then 4 th table bcoz outer for loop starts from 2 so...!


		for(start=1;start<=10;start++) 
		{
			System.out.println(positiveNum+ " * "+start +" = "+(positiveNum*start));

		}
		 input.close();
		//above for loop prints the table of user entered number only
	
	}
	 
	

}

//}
