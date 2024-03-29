public class Engineer extends Employee{

    private double salary;

    public Engineer(double salary) {

        this.salary = salary;
    }

    @Override
    public double caculateBonus() {
        double bonus = salary * 0.2;
        return bonus;
    }
}
