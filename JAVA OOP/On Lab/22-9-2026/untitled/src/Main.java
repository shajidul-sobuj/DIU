public class Main {

    public static void main(String[] args){

        student s1 = new student("Sobuj", 212);
        student s2 = new student("Rakib", 223);
        student s3 = new student("Sakib", 562);
        student s4 = new student();
        s4.credet_complete = 57;
        s4.cgpa = 1.23;

//        s1.name = "Sobuj";
//        s1.id = 212;
//        s1.email = "212@diu.edu.bd";
//        s1.cgpa = 1.23;

//        System.out.println(s1.name + " " + s1.id + " ");

        s2.display_info();
//        System.out.println(s2.marks);


//        final int value = 2;
//        System.out.println(value);

    s1.acc_balance = 1000;
    s1.updated_balance(500);
    s4.updated_cgpa(13, 1.36);
    System.out.println(s4.cgpa);



    int a = 5, b = 10;
        System.out.println(a + " " + b);
        swap(a,b);
        System.out.println(a + " " + b);

    }


    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }


}
