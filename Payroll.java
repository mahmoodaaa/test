public class Payroll {

    private Employee employee;
    private double bouns;
    private double deductions;

    public Payroll(Employee employee, double bouns, double deductions) {
        this.employee = employee;
        this.bouns = bouns;
        this.deductions = deductions;
    }

    public double salaryCalculateDeductions() {

        return employee.getSalary() + bouns - deductions;

    }

public void generatingPaySlips(){
            System.out.println(" Name : " + employee.getEmpName() );
            System.out.println(" Position : " + employee.getPosition() );
            System.out.println(" Salary :  " + employee.getSalary() );
            System.out.println("get Contacte :  " + employee.getContact());
            System.out.println(" Bouns  : " + bouns );
            System.out.println(" Deductions  : " + deductions );
            System.out.println("salaryCalculateDeductions  : " + salaryCalculateDeductions());

}

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "employee=" + employee +
                ", bouns=" + bouns +
                ", deductions=" + deductions +
                '}';
    }
}
