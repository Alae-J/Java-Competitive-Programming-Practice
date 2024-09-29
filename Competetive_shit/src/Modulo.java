// The input will contain an integer n, and n non-negative integers, each smaller than 1000, one per line.
// Outputs the number of distinct values when considered modulo 42 on a single line.

import java.util.*;

public class Modulo{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(), c;
        float m = 0;
        
        int numbers[] = new int[n];
        
        for (int i = 0; i < n; i ++){
            numbers[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i ++){
            c = 0;
            for (int j = 0; j < n; j ++){
                if (numbers[i] % 42 == numbers[j] % 42){
                    c += 1;
                }
            }
            m += (float) 1 / c;
        }
        System.out.println((int) m);
    }
}
