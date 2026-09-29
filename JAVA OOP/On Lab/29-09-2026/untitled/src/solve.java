import java.util.Scanner;

public class solve {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt();
        double r = scn.nextDouble();
        int n = scn.nextInt();
        double dd = (r/100.00)+1;
        dd = (double) Math.pow(dd,n);
        double ans = dd*s*1.0;
        System.out.println("Final Strength score after " + n + " months: " +ans);


    }




}
