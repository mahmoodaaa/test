public  class Employee {

   private int empID;
   private String empName;;
   private String  position;
   private double salary;
   private String contact;


    public Employee(int empID, String empName, String position, double salary, String contact) {
        this.empID = empID;
        this.empName = empName;
        this.position = position;
        this.salary = salary;
        this.contact = contact;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public  double calculatebouns(){
        return  salary;

    }





}

 class Manger extends  Employee{
          private double bouns;

     public Manger(int empID, String empName, String position, double salary, String contact, double bouns) {
         super(empID, empName, position, salary, contact);
         this.bouns = bouns;
     }


     @Override
    public double calculatebouns() {
        return super.getSalary() + bouns;
    }
}

class Intern extends  Employee{
   private double bouns;
    public Intern(int empID, String empName, String position, double salary, String contact, double bouns) {
        super(empID, empName, position, salary, contact);
        this.bouns = bouns;
    }


    @Override
    public double calculatebouns() {
        return super.getSalary() + bouns;
    }
}




