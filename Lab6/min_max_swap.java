package Lab6;

public class min_max_swap {
	public static void main(String[] args) {
		int arr[] = new int[10];
		for(int i = 0; i <  arr.length; i++) {
			arr[i] =  (int)(Math.random() * 25);
			System.out.print(arr[i] + "  ");
		}
		System.out.print("\nSwapped: \n");
		int max=arr[0];
		int j=0;
		for(int i=1;i<10;i++){
			if(max>arr[i]){
				max=arr[i];
				j=i;
			}
		}
		int min=arr[0];
		int k=0;
		for(int i=1;i<10;i++) {
			if(min<arr[i]) {
				min=arr[i];
				k=i;
			}
		}
		arr[j]=min;
		arr[k]=max;
		for(int i = 0; i <  arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.print("\nMax = ");
		System.out.print(min);
	}
}
