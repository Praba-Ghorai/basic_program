import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		prime(n);
		
		
	}
public static void prime(int n) {
		
		int flag=0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				flag=1;
				break;
		}
		if(flag==0)
		{
			System.out.println(" Not prime no."+n);
		}
		else
		{
			System.out.println("prime no."+n);
		}
	}
}
