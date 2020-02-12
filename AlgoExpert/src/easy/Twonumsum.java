package easy;

/*Two number sum
 * write a function that takes in a non-empty array of distinct integers and an integer representing a 
 * target sum. if any two numbers in the input array sum up to the target sum, the function should return 
 * them i an array. if no two numbers sum up to the target sum, the function should return an empty
 * array. Assume that there will be at most one pair of numbers summing up to the target sum
 *
 *Sample input : [3,5,-4,8,11,1,-1,6],10
 *Sample Output : [-1,11]
 *
 *
 *test class
 *public class Main {
	public static void main(String[] args) {
		int[] array = {3,5,-4,8,11,1,-1,6};
		int[] res = Twonumsum.twoNumberSum(array, 10);
		System.out.println(res[0]+" "+res[1]);
	}
}
 *
 */


public class Twonumsum {
	 public static int[] twoNumberSum(int[] array, int targetSum) {
         //brute force o ricerca esaustiva e si avrà n^2 confronti
            for(int i = 0; i < array.length-1;i++){
              int firstNum = array[i];  
							for(int j = i+1; j < array.length; j++){
                int secNum = array[j];    
								if(firstNum + secNum == targetSum){
												return new int[] {firstNum,secNum};
                    }
                }
            }
		return new int[0];
	}
	 
	 //con variabili traccianti per rilevare cambiamenti
	 public static void twoNumberSumVoid(int[] array, int targetSum) {
         //brute force o ricerca esaustiva e si avrà n^2 confronti
            for(int i = 0; i < array.length-1;i++){
              int firstNum = array[i];  
              System.out.println("Firstnum = "+firstNum);
							for(int j = i+1; j < array.length; j++){
                int secNum = array[j];
                System.out.println("Secnum = "+secNum);
                
								if(firstNum + secNum == targetSum){
												 System.out.println("Correct sum "+firstNum+" and "+secNum);
                    }
					System.out.println("Sum = "+ (firstNum+secNum));		
                }
            }
	}
}
