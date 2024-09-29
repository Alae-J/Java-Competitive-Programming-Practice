// This code takes an int as input, transforms it to its binary version, 
// reverses it as a string, and then outputs the corresponding int.

import java.util.*;
public class reversingBinary{
    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
        
        int i, n, r, N = sc.nextInt(), M = 0;
        String binN = "";
        
        while (N != 0){
            r = N % 2;
            N /= 2;
            binN = String.valueOf(r) + binN;
        }
        
        n = binN.length();
        
        for (i = 0; i < n; i ++){
            if (binN.charAt(i) == '1'){
                M += Math.pow(2, i);
            }
        }
        
        System.out.println(M);
    }
}
