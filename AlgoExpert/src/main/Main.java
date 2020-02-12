package main;

import easy.ThreeNumSum;
import easy.Twonumsum;

public class Main {
	public static void main(String[] args) {
		int[] array = {3,5,-4,8,11,1,-1,6};
		int[] res = ThreeNumSum.threeNumberSum(array, 6);
		System.out.println(" "+ res[0]+" "+ res[1]+" "+res[2]);
	}
}
 