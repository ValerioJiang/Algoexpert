package easy;

public class ThreeNumSum {
	public static int[] threeNumberSum(int[] array, int targetSum) {
		//brute force o ricerca esaustiva e si avrà n^2 confronti
		for(int i = 0; i < array.length-1;i++){
			int firstNum = array[i];  
			for(int j = i+1; j < array.length; j++){
				int secNum = array[j];
				for(int k = j+1; k < array.length;k++) {
					int terNum = array[k];	
					if(firstNum + secNum + terNum == targetSum){
						return new int[] {firstNum,secNum, terNum};
					}
				}
			}
		}
		return new int[0];
	}
}
