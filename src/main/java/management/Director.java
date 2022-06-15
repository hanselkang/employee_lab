package management;

public class Director extends Manager {
    private double budget;

    public Director(String name, String nino, double salary, String deptName, double budget) {
        super(name, nino, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
