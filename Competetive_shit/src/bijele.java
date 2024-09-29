//The input consists of 6 integers on a single line, each between 
// 0 and 10 (inclusive). The numbers are, in order, the numbers of kings,
// queens, rooks, bishops, knights and pawns in the set Mirko found.
// Output should consist of integers on a single line; the number of pieces
// of each type that should be added or removed. If a number is positive, 
// that many pieces must be added. If a number is negative, pieces must be removed.

import java.util.*;

public class bijele{
	
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt(), q = sc.nextInt(), kn = sc.nextInt(), b = sc.nextInt(), r = sc.nextInt(), p = sc.nextInt();
        
        System.out.printf("%d %d %d %d %d %d", 1 - k, 1 - q, 2 - kn, 2 - b, 2 - r, 8 - p);
        
    }
}
