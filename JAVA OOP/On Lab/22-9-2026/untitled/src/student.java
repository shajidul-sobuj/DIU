public class student {

    public String name;
    public int id;
    public String email;
    public double cgpa;
    public static int marks = 50;
    public final String dept = "CSE";
    public double acc_balance;
    public double credet_complete;


    // constructors
    public student(String name, int id){
        this.name = name;
        this.id = id;
    }
    public student(String name){
        this.name = name;
    }
    public student(){

    }

    public void display_info(){

        System.out.println("Name :" + name + " ID: " + id + " Department: " + dept);

    }

    public void updated_balance(double balance){
        acc_balance += balance;
        System.out.println("New balance is: " + acc_balance);
    }

    public void updated_cgpa(double semester_credit, double semester_cgpa){
        cgpa = ((cgpa*credet_complete)+(semester_cgpa*semester_credit))/(credet_complete+semester_credit);
        credet_complete += semester_credit;
    }


}
