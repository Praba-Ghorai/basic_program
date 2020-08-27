import java.util.Scanner;
import java.util.HashSet;
public class RemoveduplicateFromunsortedarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		for(int no:hs)
		{
			System.out.println(no+" ");
		}
	}

}
