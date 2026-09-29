import java.util.Arrays;
import java.util.Scanner;

public class SolveE {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = scn.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Second Maximum Score: " + a[n-2]);
//
//        for (int i=0;i<n;i++){
//            System.out.print(a[i] + " ");
//        }



    }

}
