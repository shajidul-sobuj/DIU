import java.util.Scanner;

public class SolveD {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = scn.nextInt();
        }

        int sum = 0;
        for (int x:a){
            sum += x;
        }
        double avg = (sum*1.0)/(n*1.0);
        System.out.println(" Total water intake: " + sum + " liters");
        System.out.println("Average daily intake: " + avg + " liters");
    }

}
