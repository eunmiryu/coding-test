package codingTest;

import java.util.*;

public class MeetingRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");
		
		MeetingRoom a = new MeetingRoom();
		int[][] intervals = {{5,10}, {16,20}, {0,30}};
		//int[][] intervals = {{7,10}, {2,4}};
				
		System.out.println(a.solve(intervals));		
	}
	
	public boolean solve(int[][] intervals) {
		if(intervals == null || intervals.length == 0) {
			return true;
		}
		
		Arrays.sort(intervals, (a,b)->a[0]-b[0]); //첫번째 숫자 기준 오름차순
		
		//print(intervals);
		
		int end = intervals[0][1]; //첫번째 끝나는시간
		for(int i= 1; i < intervals.length; i++) {
			if(intervals[i][0] < end) {
				return false;
			}
			end = intervals[i][1];
		};
		
		return true;
	}
	
	public void print(int[][] grid) {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j] + "\t");	
			}
			System.out.println();
		}
	}

}