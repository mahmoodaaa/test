import java.util.Date;

public class PerformanceReview {


    private Employee employee;
    private Date date;
    private String feedback;


    public PerformanceReview(Employee employee, Date date, String feedback) {
        this.employee = employee;
        this.date = date;
        this.feedback = feedback;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "PerformanceReview{" +
                "employee=" + employee +
                ", date=" + date +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
