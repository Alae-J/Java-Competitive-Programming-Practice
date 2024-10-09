/*
 * The input consists of a single line specifying the problems Hneitir has to solve. 
 * Hneitir always has to solve at least one problem. The problems are numbered from 1
 * up to 1000 and are given in increasing order, separated by semicolons (;). 
 * If Hneitir should solve two or more consecutive problems in a row it is denoted by -. 
 * An example of a possible input is 1-3;5;7;10-13 which would mean Hneitir has to solve 
 * problem 1,2,3,5,7,10,11,12,13.
 * The output is a single integer, the number of problems Hneitir has to solve.
 */

import java.util.*;

public class heimavinna {
	
	static int numProbs(String probs) {
		
		char[] listProbs = probs.toCharArray();
		
		int i = 0, c = 0, n = listProbs.length;
		
		while (i < n) {
			
			int l = 0, m = 0;
			
			while ((i < n) && (listProbs[i] <= '9') && (listProbs[i] >= '0')) {
				
				l = l * 10 + listProbs[i] - '0';
				i ++;
				
			}
			
			if ((i < n) && (listProbs[i] == '-')) {
				
				i ++;
				
				while ((i < n) && (listProbs[i] >= '0') && ((listProbs[i]) <= '9')) {
					
					m = m * 10 + listProbs[i] - '0';
					i ++;
					
				}
				
				c += m - l + 1;
				
			}
			
			if (((i < n) && (listProbs[i] == ';')) && (m == 0)) {
				
				c ++;
				i ++;
				
			}
			
			if (((i < n) && (listProbs[i] == ';')) && (m != 0)) i ++;
			
			if ((i == n) && (m == 0)) c ++;
			
		}
		
		return c;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String probs = sc.nextLine();
		
		System.out.println(numProbs(probs));
		
	}

}
