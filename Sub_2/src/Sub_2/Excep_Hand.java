package Sub_2;
import java.util.*;

public class Excep_Hand {
	int computeSum(int a[])
	{
		int sum =0;
		for(int i=0;i<a.length;i++)
		{
			sum += a[i];
		}
		return sum;
		
	}
	
	int computeQuo(int a[],int d)
	{
		int divident = computeSum(a) / d;
		
		return divident;
		
	}
	
	void computeStatus(int arr[]) throws Exception
	{
		if(computeSum(arr)<50)
		{
			throw new Exception();
		}
		else {
			System.out.println("\nSum of Elements of array is Greater than 50");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Excep_Hand e = new Excep_Hand();
		int sum = 0;
		
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int number[] = new int[n];
		
		System.out.println("Enter elements of array: ");
		
		for(int i = 0; i<n; i++)
		{
			number[i] = sc.nextInt();
		}
		
		System.out.println("\nSum of array : "+e.computeSum(number));
		
		System.out.println("\nEnter Divisor: ");
		int divisor = sc.nextInt();
		
		
		System.out.println("\nQuotient : "+e.computeQuo(number, divisor));
		
		try {
			e.computeStatus(number);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("\nSum of Elements of array is less than 50");
		}
		
		
		
	}

	}


