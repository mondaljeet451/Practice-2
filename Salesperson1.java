public class Salesperson1 extends Employee1 {
    public String name;
    public long id;
    public int salary;
    public String salescatagory;


    public Salesperson1(String name, long id, int salary, String salescatagory) {
        super(name, id, salary);
        this.salescatagory = salescatagory;
    }


    public void salesrating() {

        System.out.println();
    }
}
