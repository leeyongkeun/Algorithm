import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Solution_병합정렬 {

	public static void main(String[] args) {

		Integer [] arr = new Integer[100];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(arr.length);
		}
		ArrayList <Integer> list = new ArrayList(Arrays.asList(arr));

		System.out.println(mergeSort(list));
		
	
		
	}//main

	public static List<Integer> mergeSort (List<Integer> list){
		if(list.size() <=1) {
			return list;
		}else {
			int divide = list.size()/2;
			List <Integer> left = mergeSort(list.subList(0, divide));
			List <Integer> right = mergeSort(list.subList(divide, list.size()));
			return merge(left,right);
			
		}
	}
	
	public static List<Integer> merge (List<Integer> left, List<Integer> right){
		
		List<Integer> result = new ArrayList<>(left.size() + right.size());
		int leftindex = 0;
		int rightindex = 0;
		
		while (leftindex < left.size() && rightindex< right.size()) {
			
			if(left.get(leftindex) < right.get(rightindex)) {
				result.add(left.get(leftindex++));
				
			}else 
				result.add(right.get(rightindex++));
			
		}
		
		while (leftindex < left.size()) {
			result.add(left.get(leftindex++));
		}
		
		while (rightindex < right.size()) {
			result.add(right.get(rightindex++));
		}
		
		return result;
	}
	
}// class















