
public class hii {
	public void hii() {
		System.out.println("hii probal!!");
		//return "hii riju>>>";
	}
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("addition of number"+a+"+"+b+" "+"="+c);
		//return c;
	}
	
	public void array_sort(int arr[]) {
		int n=arr.length;int temp=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		
	
}
}