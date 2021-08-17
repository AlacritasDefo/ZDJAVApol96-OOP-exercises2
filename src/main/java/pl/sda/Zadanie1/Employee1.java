package pl.sda.zadanie1;

public class Employee1 extends Person1 {
    private String job;
    private double salary;

    public Employee1(String job, double salary) {
        this.job = job;
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                " imię= " + getFirstName() +
                ", nazwisko= " + getLastName() +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}
