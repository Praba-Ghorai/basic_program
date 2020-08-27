import java.util.Scanner;

//import java.util.Scanner;

public class Arraycopy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n=sc.nextInt();
		System.out.println("enter the array element: ");
		int []array= new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
	System.out.println("original array");
	for(int i=0;i<n;i++) {
		System.out.println(array[i]);
	}
 
	System.out.println("copying....");
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
			arr[i]=array[i];
		}
	
	
	System.out.println("copied array-----------");
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
}
}
