import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Z32_MergeSort {

	public static void main(String[] args) {
		
//		Integer[] arr = {6,4,8,5,7,2,9,3,0,1};
		int [] arr = new int[200000];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(arr.length);
		}
		ArrayList<Integer> list = new ArrayList(Arrays.asList(arr));
		
		// 배열의 원소를 통째로 리스트에 추가하기
		long time = System.currentTimeMillis();
		
		mergeSort(list);
		
		System.out.println(System.currentTimeMillis() - time );
		
	}// main
	
	// 두덩어리의 리스트로 쪼개는 메서드
	
	public static List<Integer> mergeSort(List<Integer> list){
		if(list.size() <= 1) {  // 종료 파트 : 원소가 1개 이하이면 종료
			return list;
			
		} else { // 재귀파트
			int divide = list.size()/2;
			List <Integer> left = mergeSort(list.subList(0, divide));
			List <Integer> right = mergeSort(list.subList(divide, list.size()));
			return merge(left,right);
			
		}
		
	}
	
	// 두 덩어리의 리스트를 하나로 합치는 메서드 
	
	public static List<Integer> merge(List<Integer> left ,List<Integer> right){
		// 정렬해서 합친 하나의 리스트 
		List<Integer> result = new ArrayList<>(left.size() + right.size());
		int leftlist = 0; // 왼쪽 리스트의 인덱스
		int rightlist = 0;// 오른쪽 리스트의 인덱스 
		
		while(leftlist < left.size() && rightlist < right.size()) { // 왼쪽 오른쪽 모두 원소가 있을 경우
			if(left.get(leftlist) < right.get(rightlist)) {
			}else
				result.add(left.get(rightlist++));
		}
		
		while(leftlist < left.size()) { // 왼쪽  원소만 있을 경우
			result.add(left.get(leftlist++));
		}
		
		while(rightlist < right.size()) { // 오른쪽 원소만 있을 경우
			result.add(left.get(rightlist++));
		}
		
		return result;
	}

}//class












