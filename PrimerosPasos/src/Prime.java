
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 4;
		boolean isPrime = true;
		
		for(int i=2;i<num;i++)
	
		{
			if (num%i==0)			
			{
			isPrime =false;
			break;
			}
		}
		if(isPrime)
		{
			System.out.println(num + " is a Prime number!!!!!!!!!!!!!!!!!");
		}
		else
		{
			System.out.println("Not a Prime number");
		}
			
	}

}
