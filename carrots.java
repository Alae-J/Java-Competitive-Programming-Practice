// Input starts with two integers N and P on a single line,
// denoting the number of contestants in the contest and the 
// number of huffle-puff problems solved in total. 
// Then follow N lines, each consisting of a single non-empty line
// in which the contestant describes him or herself. You may assume 
// that the contestants are good at describing themselves, in a way 
// such that an arbitrary 5-year-old with hearing problems could understand it.

import java.util.*;

public class carrots{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), P = sc.nextInt();
        for (int i = 0; i < N; i ++){
            sc.nextLine();
        }
        System.out.println(P);
    }
}