import java.util.*;
public  class sample {
    //formula of nCr = n!/(r!*(n-r)!)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ans = fact(n) / (fact(r) * fact(n - r));
        System.out.println(ans);
        
    }
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}