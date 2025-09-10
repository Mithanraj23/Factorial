import java.util.*;
public  class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+fact(i);
        }
        System.out.println(sum);//sum of factorials 153=1+2+6+24+120
    }
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}