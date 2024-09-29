import java.util.*;

public class bijele{
	
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt(), q = sc.nextInt(), kn = sc.nextInt(), b = sc.nextInt(), r = sc.nextInt(), p = sc.nextInt();
        
        System.out.printf("%d %d %d %d %d %d", 1 - k, 1 - q, 2 - kn, 2 - b, 2 - r, 8 - p);
        
    }
}