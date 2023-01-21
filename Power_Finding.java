import java.util.Scanner;
public class Power_Finding {
	public static void main(String[] args) 
	{
		int exponent=0,base=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the base value: ");
		base=input.nextInt();
		System.out.println("enter the power value: ");
		exponent=input.nextInt();
		long result=1;
		while(exponent!=0)//power value until it zero loop executes 0!=0 false 
		{
			result*=base;//1*3     //3*3        //9*3/         27*3/81
			exponent--; //4--      //3//            2//          1/           /0
		}
		System.out.println("power of "+base+"is "+result);
	
		 input.close();
	}
	

}
