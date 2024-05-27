import javax.swing.*;
import java.util.ArrayList;

public class Department {

    private  String depName;
    private double budget;
    ArrayList<Employee> employees ;


    public Department(String depName, double budget) {

        this.depName = depName;
        this.budget = budget;
        employees = new ArrayList<>();

    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public double getBudet() {
        return budget;
    }

    public void setBudet(double budet) {
        this.budget = budet;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }


    public void addEmployee(Employee e){

        if (findEmployee(e.getEmpName()) >=0) {
            System.out.println("Employee is already on file");
        }
         employees.add(e);
        System.out.println("employee added");

    }


public void RemoveEmployee(Employee e){
 int find = findEmployee(e);
        if(find<0){
           System.out.println("not found ");


        }

        employees.remove(e);
        System.out.println(e.getEmpName() + "was removed");


}
public int findEmployee(Employee e){

       return  employees.indexOf(e);
}


public int findEmployee(String empName) {

    for (Employee e : employees) {
        if (e.getEmpName().equals(empName))
            return 1;

    }

    System.out.println("not found");

    return 0;
}

    @Override
    public String toString() {
        return "Department{" +
                "depName='" + depName + '\'' +
                ", budet='" + budget + '\'' +
                ", employees=" + employees +
                '}';
    }
}
