public class pracprac {
	String [] drum = {"hello","hi"};
	
	public int solution(String[] drum) {
		
		int [][] map = new int [6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				map[i][j] = drum[i].charAt(j);
				
				
			}
		}
		
		
		return 0;
		
		
		
	}
}
