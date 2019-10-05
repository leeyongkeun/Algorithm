import java.util.ArrayList;
import java.util.Random;

public class Z31_InsertSort {

	public static void main(String[] args) {

		//int [] arr = {1,4,7,0,5,6,8,2,9,3};
		int [] arr = new int[100];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(arr.length);
		}
		//LinkedList<Integer> ll = new LinkedList <>(); // 3000개 삽입정렬 2137ms
		ArrayList<Integer> ll = new ArrayList(); // 3000개 삽입정렬 10ms
		//long time = System.currentTimeMillis();
		
		for (int i = 0; i < arr.length; i++) {
			int index = 0;
			int j = 0;
			for (j = 0; j < i; j++) {
				if(arr[i] < ll.get(j)) {
					break;
				}
			}
			ll.add(j, arr[i]);
		}
		System.out.println(ll);
		
		//System.out.println(System.currentTimeMillis() - time );
		
	}// m

} // c
