package activities;

import java.util.Arrays;

public class Activity2 {
	
	
		public static void main(String[] args) {
			
			int [] Arrnum = new int [6]; 
			Arrnum[0] = 10;
			Arrnum[1] = 77;
			Arrnum[2] = 10;
			Arrnum[3] = 54;
			Arrnum[4] = -11;
			Arrnum[5] = 10;
			
			System.out.println("Arrnum []= " + Arrays.toString(Arrnum));
			
			int x= 10;
			int y=30;
		System.out.println("Result:" + res(Arrnum, x, y));
			
			
		}
		 
		public static boolean res (int[] nums, int x, int y ) {
		int sum = 0;
		for (int z: nums) {
			if (z==x) {
				sum+=z;
				System.out.println(z);
			}
			
			if (sum > y) {
				break;
			}
		}
		return sum == 30;
		}
		
		
		
		}