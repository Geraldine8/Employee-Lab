package Management;

public class Director extends Manager {
    private double budget;

    public Director(String name, String deptName, String NI, double salary, double budget) {
        super(name, deptName, NI, salary);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }

    @Override
    public double payBonus(){
        return (this.salary * 0.02);
    }


}
