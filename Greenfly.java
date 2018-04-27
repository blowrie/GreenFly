/*
2. The Greenfly Problem
Greenfly can reproduce asexually. After one week of life a lone female can produce eight offspring a day. Starting at the beginning of day 1 with a single mature female, how many greenfly could there be by the end of day 28? It may be assumed that:
• There are no deaths
• All offspring are females
Note that at the end of day 1 there will be 9 greenfly (original + 8 offspring). At the end of day 7 there will be 57 greenfly (original + 8 × 7 offspring). At the end of day 8 there will be 129 greenfly (original + 8 × 8 offspring + 64 offspring from the daughters produced on day 1).
*/

import java.util.*;

class Untitled {
	public static void main(String[] args) {
		int i = 1;
		int totalAll = 0;
		int totalOff = 0;
		int count = 1;
		int day = 28; 
		int offSpring = 8;
		int totalFly = 1; 
		
		
		do {
				if(count < 7) {
				 	totalOff = totalOff + offSpring;
				} 
				
				if(count == 7) {
						totalOff = totalOff + offSpring;
						totalAll = totalOff + totalFly;
						System.out.println("Week 1: " + totalAll + " GreenFly");
				} 
				
				if(count > 7) {
					totalFly = totalFly + offSpring;
					totalAll = totalFly * offSpring;
					
				}
				
				if(count == 14 || count == 21 || count == 28) {
					i++;
					System.out.println("Week " + i + ": " + totalAll + " GreenFly");
				}
					
			
		count++;
			
		}while(count <= 28);
	}
}
		
		