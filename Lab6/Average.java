package Lab6;

public class Average {
	public static void main(String[] args) {
		int arr[] = new int[10];
		for(int i = 0; i <  arr.length; i++) {
			arr[i] =  (int)(Math.random() * 20);
			System.out.print(arr[i] + "  ");
		}
		System.out.print("\nAverage: \n");
		double s=0;
		for(int i = 0; i <  arr.length; i++) {
			s+=arr[i];
		}
		double aver=s/(arr.length);
		System.out.print(aver);
	}
}
