import java.util.Scanner;

public class Problem2 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int gcd = 1;

        for(int k = 2; k <= n1; k++){
            if(n1 % k == 0 && n2 % k == 0){
                if(k > gcd){
                    gcd = k;
                }
            }
        } System.out.println(gcd);
    }
}
