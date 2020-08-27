import java.util.Scanner;

public class main_test {
	public static void main(String[] args) {
		/*
		 * hii hi=new hii(); Scanner sc =new Scanner(System.in); int a=sc.nextInt(); int
		 * b=sc.nextInt(); hi.add(a,b);
		 * 
		 * hi.hii(); System.out.println("enter array length"); int size=sc.nextInt();
		 * int arr[]=new int[size]; System.out.println("enter element"); for(int
		 * i=0;i<size;i++) { arr[i]=sc.nextInt(); } hi.array_sort(arr);
		 */
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter elements:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter value of k");
		int k=sc.nextInt();
		ArrayThirdLargest obj=new ArrayThirdLargest();
		obj.Thirdlargest(arr, k);
	}

}
