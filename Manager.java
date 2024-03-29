public class Manager extends Employee{
    private double salary;

    public Manager(double salary) {
        this.salary = salary;
    }

    @Override
    public double caculateBonus() {
        double bonus = salary * 0.5;
        return bonus;
    }
}
