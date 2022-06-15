package staff;

public abstract class Employee {

    private String name;
    private String nino;

    private double salary;

    public Employee(String name, String nino, double salary) {
        this.name = name;
        this.nino = nino;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNino() {
        return this.nino;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double incrementSalary){
        this.salary += incrementSalary ;
    }

    public double payBonus(){
        this.salary *= 0.01;
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }


}
