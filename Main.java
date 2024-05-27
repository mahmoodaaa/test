import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {




    public static void main(String[] args) {


        Employee e1 = new Employee(444,"Ahmed","Softwear Engineer",80000,"07758523");
        Employee e2 = new Employee(123,"Mahmood","Java Developer",60000,"05443212");
        Employee e3 = new Employee(525,"Rashed","Manger",100000,"0785621");

            Department d1 = new Department("IT",800000);
            d1.addEmployee(e1);
            Department d2 = new Department("Engineer",10000000);
                d1.addEmployee(e2);

            Payroll p1 = new Payroll(e1,400,1000);
            Payroll p2 = new Payroll(e2,200,2000);
            p1.generatingPaySlips();
            p2.generatingPaySlips();

PerformanceReview per1 = new PerformanceReview(e1,new Date(),"Very Good " );

        PerformanceReview per2 = new PerformanceReview(e2,new Date(),"Excilent " );


        System.out.println(per1);
        System.out.println(per2);



    }
}