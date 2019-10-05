import java.util.Arrays;

public class HoareandLomuto {

	public static int [] arr = {3,2,4,6,9,1,8,7,5};
	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));
		
		
		Quicksort(0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}//main
	
	public static void Quicksort(int left, int right) {
		if(left >= right) {
			return;
		} 
		//int pivot = Hoare(left, right);
		int pivot = Lomoto(left, right);
		Quicksort(left, pivot-1);
		Quicksort(pivot+1, right);
		
	}
	
	public static int Lomoto (int left, int right ) {
		int pivot = arr[right];
		int i = left-1;
		
		for (int j = left; j < right; j++) {
			if(arr[j] <= pivot) {
				i++;
				Swap(i,j);
			}
		}
		Swap(i+1,right);
		return i+1;
	}
	
	
	public static int Hoare ( int left, int right) {
		int pivot = arr[left];
		int i = left;
		int j = right;
		
		while(true) {
			while (arr[i] < pivot) i++;
			while (arr[j] > pivot) j--;
			if (i >=j) return j;
			Swap(i,j);
		}
		
		
	}
	
	public static void Swap (int i , int j) {
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}//class
