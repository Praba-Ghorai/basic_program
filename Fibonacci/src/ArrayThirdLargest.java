
public class ArrayThirdLargest {
	public void Thirdlargest(int arr[],int k) {
		
		/*
		 * for(int i=0;i<arr.length;i++) { for(int j=i+1;j<arr.length;j++) {
		 * if(arr[j]>arr[j+1]) { int temp=arr[j]; arr[j]=arr[j+1]; arr[j+1]=temp; } } }
		 */
		
		System.out.println("For searching k th largest element");
        System.out.println("----------------------------------");
        System.out.println("Enter the value of k:");
        int l=arr.length;
        System.out.println("the"+k+"th largest element is: ");
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if(arr[i]>arr[j]){
                    int big=arr[i];
                    arr[i]=arr[j];
                    arr[j]=big;
                }
            }
            if(i==k){
                System.out.println(arr[l-i]+" ");
                break;
            }
        }
	}
 
	

	}


