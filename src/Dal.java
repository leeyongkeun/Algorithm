import java.util.Arrays;

public class Dal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr= {{9,20,2,18,11},
						{19,1,25,3,21},
						{8,24,10,17,7},
						{15,4,16,5,6},
						{12,13,22,23,14}};

		int [] data= new int[25];
		int index=0; 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				data[index++] = arr[i][j];
			}
		}
		System.out.println(Arrays.toString(data));
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		int r = 0;
		int c = -1;
		index = 0;
		int step = arr.length;// 몇칸 직진할지
		
		while(step > 0) {
			
			// 우
			
			for (int i = 0; i < step; i++) {
				c++;
				arr[r][c]= data[index++];
			}
			step--;
			
			// 하
			
			for (int i = 0; i < step; i++) {
				r++;
				arr[r][c]= data[index++];
			}
			// 좌
			
			for (int i = 0; i < step; i++) {
				c--;
				arr[r][c]= data[index++];
			}
			
			step--;
			// 상
			
			for (int i = 0; i < step; i++) {
				r--;
				arr[r][c]= data[index++];
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.printf("%2d " , arr[i][j]);
			}
			System.out.println();
		}
		
			
		
	}//main

}//class
