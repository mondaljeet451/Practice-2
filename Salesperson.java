public class Salesperson extends Employee{
    private double salary;

    public Salesperson(double salary) {

        this.salary = salary;
    }

    @Override
    public double caculateBonus() {
        double bonus = salary * 0.1;
        return bonus;
    }
}
