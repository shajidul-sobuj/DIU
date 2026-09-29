import java.util.Scanner;

public class SolveC {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double bmi = scn.nextDouble();
        int hrt = scn.nextInt();
        if(bmi<18.5 && hrt > 100){
            System.out.println("Underweight with Tachycardia");
        }else if(bmi>=18.5 && bmi<=24.9 && hrt>=60 && hrt<=100){
            System.out.println("Healthy Condition");
        }else if(bmi>=25 && bmi<=29.9 && hrt > 110){
            System.out.println("Overweight or High Heart Rate");
        }else {
            System.out.println("Consult Doctor Immediately");
        }


    }




}
