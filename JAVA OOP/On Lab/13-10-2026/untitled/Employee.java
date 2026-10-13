public class Employee {
    private String employeeId;
    private String name;

    public Employee(String employeeId, String name){
        this.employeeId = employeeId;
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Employee id: " + employeeId);
        System.out.println("Employee name: " + name);
    }
}
class Doctor extends Employee {
    private String specialization;
    private String designation;

    public Doctor(String employeeId, String name, String designation, String specialization){
        super(employeeId, name);
        this.specialization = specialization;
        this.designation = designation;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Employee Spe: " + specialization);
        System.out.println("Employee Desi: " + designation);
    }
}
class DoctorAssistant extends Employee {
    private String department;
    public DoctorAssistant(String designation, String specialization, String department){
        super(designation, specialization);
        this.department = department;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Employee Depart: " + department);
    }
}
