public class Employee_Main {
    int empId;
    String empName;

    public void data() {
        empId = 3;
        empName = "Rohit Sharma";
    }

    public void show() {
        System.out.println(empId + " : " + empName);
    }

    public static void main(String[] args) {

        Employee2 emp = new Employee2();
        Employee_Main em = new Employee_Main();

        emp.empl();
        emp.show();

        emp.setEmpId(2);
        emp.setEmpName("Dev Yadav");

        em.data();
        em.show();

        System.out.println(emp.getEmpId() + " : " + emp.getEmpName());
    }
}